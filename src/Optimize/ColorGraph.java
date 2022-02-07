package Optimize;

import Codegen.CGBlock;
import Codegen.CGBuilder;
import Codegen.CGFunc;
import Codegen.CGValue.VirtualReg;
import Codegen.CodegenInst.*;
import Optimize.LiveGragh.GraphNode;

import java.util.*;

public class ColorGraph {
    public Map<String, GraphNode> VirtualRegMap;
    public boolean FindPlan;
    public Set<String> PutInMemList;
    public ArrayList<GraphNode> NodeStack;
    public Map<String,Integer> ColorMap;
    public ColorGraph(CGFunc Func,int ColorNum) {
        //Initial
        for (CGBlock Block : Func.BlockList)
            for (CGInst Inst = Block.Head; Inst != null; Inst = Inst.NexInst)
                Inst.Clear();
            PutInMemList=new HashSet<>();
            VirtualRegMap=new HashMap<>();
            NodeStack=new ArrayList<>();
            ColorMap=new HashMap<>();



        //Link the Inst
        for (CGBlock Block : Func.BlockList) {
            for (CGInst Inst = Block.Head; Inst != null; Inst = Inst.NexInst) {
                if (Inst.rd instanceof VirtualReg)
                    if (VirtualRegMap.get(((VirtualReg) Inst.rd).Name)==null)
                        VirtualRegMap.put(((VirtualReg) Inst.rd).Name, new GraphNode(((VirtualReg) Inst.rd).Name));
                if (Inst instanceof CGret) continue;
                else if (Inst instanceof CGjump) {
                    CGjump _Inst = (CGjump) Inst;
                    for (CGBlock JumpBlock : Func.BlockList) {
                        if (JumpBlock.Name.equals(_Inst.JumpBlock)) {
                            Inst.AllNex.add(JumpBlock.Head);
                            JumpBlock.Head.AllPre.add(Inst);
                            break;
                        }
                    }
                } else if (Inst instanceof CGbr) {
                    CGbr _Inst = (CGbr) Inst;
                    for (CGBlock JumpBlock : Func.BlockList) {
                        if (JumpBlock.Name.equals(_Inst.BrLabel)) {
                            Inst.AllNex.add(JumpBlock.Head);
                            JumpBlock.Head.AllPre.add(Inst);
                            break;
                        }
                    }
                    if (Inst.NexInst != null) {
                        Inst.AllNex.add(Inst.NexInst);
                        Inst.NexInst.AllPre.add(Inst);
                    }
                } else {
                    if (Inst.NexInst != null) {
                        Inst.AllNex.add(Inst.NexInst);
                        Inst.NexInst.AllPre.add(Inst);
                    }
                }
            }
        }
        for (CGBlock Block : Func.BlockList)
            for (CGInst Inst = Block.Head; Inst != null; Inst = Inst.NexInst) {
                if (Inst.rs1 instanceof VirtualReg)
                    VirtualRegMap.get(((VirtualReg) Inst.rs1).Name).use = true;
                if (Inst.rs2 instanceof VirtualReg)
                    VirtualRegMap.get(((VirtualReg) Inst.rs2).Name).use = true;
            }

        //Expend
        boolean flat = true;
        while (flat) {
            flat = false;
            for (CGBlock Block : Func.BlockList)
                for (CGInst Inst = Block.Head; Inst != null; Inst = Inst.NexInst) {
                    for (CGInst NexInst : Inst.AllNex) {
                        for (String UseName : NexInst.PreAliveList)
                            if (Inst.PreAliveList.contains(UseName) == false &&
                                    !(Inst.rd instanceof VirtualReg && ((VirtualReg) Inst.rd).Name == UseName)) {
                                flat = true;
                                Inst.PreAliveList.add(UseName);
                            }
                    }
                }
        }

        //Find Call
        boolean NeedClear=false;
        for (CGBlock Block : Func.BlockList)
            for (CGInst Inst = Block.Head; Inst != null; Inst = Inst.NexInst)
            if (Inst instanceof CGcall)
            {
                for (var NexInst:Inst.AllNex)
                {
                    if (!NexInst.PreAliveList.isEmpty())
                    {
                        NeedClear=true;
                        for (var Name : NexInst.PreAliveList)
                            PutInMemList.add(Name);
                    }
                }
            }
        if (NeedClear)
        {
            FindPlan=false;
            return;
        }
        //Find Conflict
        for (CGBlock Block : Func.BlockList)
            for (CGInst Inst = Block.Head; Inst != null; Inst = Inst.NexInst) {
                for (var LeftName : Inst.PreAliveList) {
                    GraphNode LeftNode = VirtualRegMap.get(LeftName);
                    if (LeftNode == null) continue;
                    for (var RightName : Inst.PreAliveList)
                        if (RightName != LeftName) {
                            GraphNode RightNode = VirtualRegMap.get(RightName);
                            if (RightNode==null) continue;
                            LeftNode.Link(RightNode);
                        }
                }
            }
        //try
        {
            flat = true;
            while (flat) {
                flat = false;
                for (GraphNode Node : VirtualRegMap.values())
                    if (Node.state == GraphNode.statetype.alive && Node.Du() < ColorNum) {
                        Node.state = GraphNode.statetype.instack;
                        NodeStack.add(Node);
                        flat = true;
                    }
            }

            int mxDu = 0;
            String mxID = null;
            for (GraphNode Node : VirtualRegMap.values())
                if (Node.state == GraphNode.statetype.alive) {
                    if (Node.Du() > mxDu) {
                        mxDu = Node.Du();
                        mxID = Node.Name;
                    }
                }
            if (mxID!=null)
            PutInMemList.add(mxID);
        }


        if (PutInMemList.isEmpty())
        {
            FindPlan=true;
            ColorMap=new HashMap<>();
            boolean[] ColorUse=new boolean[ColorNum+10];
            for (int i=NodeStack.size()-1;i>=0;i--)
            {
                for (int j=0;j<ColorNum+10;j++) ColorUse[j]=false;
                GraphNode NowNode=NodeStack.get(i);
                for (var LinkNode:NowNode.Edge.values())
                {
//                    System.out.println(LinkNode.Name);
                    if (LinkNode.state== GraphNode.statetype.havecolor && LinkNode.color!=-1)
                        ColorUse[LinkNode.color]=true;
                }
                NowNode.state= GraphNode.statetype.havecolor;
                if (NowNode.use==false)
                {
                    NowNode.color = -1;
                    ColorMap.put(NowNode.Name,-1);
                }
                else
                for (int j=0;j<ColorNum;j++)
                {
                    if (ColorUse[j]==false) {
                        NowNode.color = j;
                        ColorMap.put(NowNode.Name,j);
                        break;
                    }
                    if (j==ColorNum)
                        System.out.println("Wrong Answer in Color Graph");
                }
            }
        }else
        {
            FindPlan=false;
            return;
        }
    }
}
