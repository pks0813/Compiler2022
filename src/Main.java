
import AST.ProgramNode;
import FrontEnd.ASTBuilder;
import FrontEnd.SemanticCheck;
import IR.IRBuilder;
import IR.IRPrint;
import Parse.MXLexer;
import Parse.MXParser;
import Util.ErrorListener.MXErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import Util.error.error;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws Exception{
    String namein = "test.mx";
    InputStream input = new FileInputStream(namein);
    String namell= "test.ll";
    OutputStream llOutput=new FileOutputStream(namell);
    ProgramNode ASTRoot;

    try {
        MXLexer lexer = new MXLexer(CharStreams.fromStream(input));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new MXErrorListener());
        MXParser parser = new MXParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new MXErrorListener());
        ParseTree parseTreeRoot = parser.program();
        ASTBuilder astBuilder=new ASTBuilder();
        ASTRoot=(ProgramNode)astBuilder.visit(parseTreeRoot);
        SemanticCheck SemanticAns=new SemanticCheck();
        SemanticAns.visit(ASTRoot);
        IRBuilder IRbuilder=new IRBuilder(SemanticAns.WolrdScope);
        IRbuilder.visit(ASTRoot);
        new IRPrint(IRbuilder,llOutput);
    } catch (error er) {
        System.err.println(er.tostring());
        throw new RuntimeException();
    }
    }
}
