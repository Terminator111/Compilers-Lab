package L3;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;

        String file;
        if (args.length > 0) {
            file = args[0];
            is = new FileInputStream(file);
        }

        // 输入流交给词法分析器
        CharStream input = CharStreams.fromStream(is);
        CmmLexer lexer = new CmmLexer(input);

        // 产生词法单元流
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 词法单元流交给语法分析器解析
        CmmParser parser = new CmmParser(tokens);

        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();


        CmmSemanticListener listener = new CmmSemanticListener();
        walker.walk(listener, tree);
    }
}