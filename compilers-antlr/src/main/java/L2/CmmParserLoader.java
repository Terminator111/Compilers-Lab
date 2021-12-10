package L2;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;

public class CmmParserLoader extends CmmParserBaseListener {
    ArrayList<NodeEntity> props = new ArrayList<NodeEntity>(); // 存储先序遍历结果
    private final Vocabulary VOCABULARY; // 用于获得token的name
    private final Map<String, Integer> ruleIndexMap; // 用于获得rule的name
    private int depth;

    CmmParserLoader(CmmLexer lexer, Parser parser) {
        this.VOCABULARY = lexer.getVocabulary();
        ruleIndexMap = parser.getRuleIndexMap();
        depth = -1;
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        depth += 1;
        if (ctx.getChildCount() > 0) {  // 忽略产生空串的语法单元
            int line = ctx.start.getLine();
            // 根据值(index)获取键(name)
            String name = null;
            for (Map.Entry<String, Integer> m : ruleIndexMap.entrySet()) {
                if (m.getValue().equals(ctx.getRuleIndex())) {
                    name = m.getKey();
                }
            }
            assert name != null;
            name = name.substring(0, 1).toUpperCase() + name.substring(1); // 第一个字母大写
            props.add(new NodeEntity(0, name, line, depth));
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        depth -= 1;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        depth += 1;
        Token nodeToken = node.getSymbol();
        String name = VOCABULARY.getSymbolicName(nodeToken.getType());
        String text = nodeToken.getText().trim();
        if (name.equals("INT")) {
            if (text.startsWith("0x") || text.startsWith("0X")) {
                text = "" + new BigInteger(text.substring(2), 16);
            } else if (text.startsWith("0") && text.length() > 1) {
                text = "" + new BigInteger(text, 8);
            }
        }
        if (name.equals("FLOAT")) {
            text = String.format("%.6f", new BigDecimal(text));
        }
        if (!name.equals("EOF")) {  // 忽略EOF
            props.add(new NodeEntity(1, name, text, depth));
        }
        depth -= 1; // 回溯
    }

}
