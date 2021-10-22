
import AST.ProgramNode;
import FrontEnd.ASTBuilder;
import FrontEnd.SemanticCheck;
import Parse.MXLexer;
import Parse.MXParser;
import Util.ErrorListener.MXErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import Util.error.error;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception{
//    String name = "test.mx";
//    InputStream input = new FileInputStream(name);
    ProgramNode ASTRoot;

    try {
        MXLexer lexer = new MXLexer(CharStreams.fromStream(System.in));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new MXErrorListener());
        MXParser parser = new MXParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new MXErrorListener());
        ParseTree parseTreeRoot = parser.program();
        ASTBuilder astBuilder=new ASTBuilder();
        ASTRoot=(ProgramNode)astBuilder.visit(parseTreeRoot);
        new SemanticCheck().visit(ASTRoot);
    } catch (error er) {
        System.err.println(er.tostring());
        throw new RuntimeException();
    }
    }
}
