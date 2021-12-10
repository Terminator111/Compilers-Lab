package L2;

import org.antlr.v4.runtime.*;

import java.util.Map;
import java.util.TreeMap;

public class CmmErrorListener extends BaseErrorListener {
    public Map<Integer, String> errMsgMap = new TreeMap<>(); // 存储行号对应的错误信息，便于一行只打印一次

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // 勘误备选分支判断  行号是RB的上一个token
        if (msg.startsWith("array size must be an integer constant")) {
            CommonToken curToken = (CommonToken) offendingSymbol;
            CommonTokenStream tokenStream = (CommonTokenStream) recognizer.getInputStream();
            CommonToken preToken = (CommonToken) tokenStream.getTokens().get(curToken.getTokenIndex() - 1);
            line = preToken.getLine();
        }
        errMsgMap.put(line, msg);
    }
}

