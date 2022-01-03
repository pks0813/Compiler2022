package Optimize.LiveGragh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GraphNode {
    public String Name;
    public Map<String,GraphNode> Edge=new HashMap<>();
    public enum statetype{
        alive,inmem,instack,havecolor
    }
    public statetype state;
    public boolean use=false;
    public int color=-1;
    public GraphNode(String _Name){
        Name=_Name;
        state=statetype.alive;
    }
    public GraphNode(String _Name,String _LinkName,GraphNode _LinkNode){
        Name=_Name;
        state=statetype.alive;
        Edge.put(_LinkName,_LinkNode);
    }
    public void Link(GraphNode LinkNode){
        Edge.put(LinkNode.Name,LinkNode);
    }
    public int Du() {
        int num=0;
        for (var side:Edge.values())
            if (side.state==statetype.alive) num++;
        return num;
    }
    public void Delete(GraphNode DeleteNode){
        Edge.remove(DeleteNode.Name);
    }
    @Override
    public String toString(){
        return "Node:"+Name+"   "+state+"   "+color;
    }

}
