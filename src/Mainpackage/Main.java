package Mainpackage;
import Parse.MXLexer;
import Parse.MXParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception{
    String name = "test.mx";
    InputStream input = new FileInputStream(name);
    try {
        MXLexer lexer = new MXLexer(CharStreams.fromStream(input));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new MXErrorListener());
        MXParser parser = new MXParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new MXErrorListener());
        ParseTree parseTreeRoot = parser.program();
    } catch (error er) {
        System.err.println(er.toString());
        throw new RuntimeException();
    }
}
}
