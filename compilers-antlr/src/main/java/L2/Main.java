package L2;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
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

        // error process
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        CmmErrorListener errListener = new CmmErrorListener();
        parser.addErrorListener(errListener);

        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();

        Map<Integer, String> errMsgMap = errListener.errMsgMap;
        boolean hasError = !errMsgMap.isEmpty();

        CmmParserLoader listener = new CmmParserLoader(lexer, parser);
        walker.walk(listener, tree);

        if (!hasError) {
            for (NodeEntity ne : listener.props) {
                for (int i = 0; i < ne.getDepth(); i++) {
                    System.err.print("  ");
                }
                if (ne.getType() == 0) {  // 语法单元
                    System.err.println(ne.getName() + " (" + ne.getLine() + ")");
                } else {  // 词法单元
                    String name = ne.getName();
                    System.err.print(name);
                    if (name.equals("ID") || name.equals("TYPE") || name.equals("INT") || name.equals("FLOAT")) {
                        System.err.print(": " + ne.getText());
                    }
                    System.err.println();
                }
            }
        } else {
            for (Map.Entry<Integer, String> entry : errMsgMap.entrySet()) {
                System.err.println("Error type B at Line " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}