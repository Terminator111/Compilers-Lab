package L1;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // From the inner class you can't assign value to a local variable (itself) declared somewhere in the enclosing class, but you can change state (call methods, setters, ...) of the referenced object (if the variable points to some object and not to a primitive type). And array is object.
        final boolean[] hasError = {false};

        InputStream is = new FileInputStream(args[0]);
        CharStream input = CharStreams.fromStream(is);

        CmmLexer lexer = new CmmLexer(input) {
            @Override
            public void notifyListeners(LexerNoViableAltException e) {
                hasError[0] = true;
                String text = _input.getText(Interval.of(_tokenStartCharIndex, _input.index()));
                System.err.println("Error type A at Line " + _tokenStartLine + ": Mysterious character \"" + text.trim() + "\".");
            }
        };
        List<? extends Token> tokenList = lexer.getAllTokens();
        final Vocabulary VOCABULARY = lexer.getVocabulary();

        if (!hasError[0]) {
            for (Token token : tokenList) {
                String SymbolicName = VOCABULARY.getSymbolicName(token.getType());
                String text = token.getText().trim();
                int line = token.getLine();
                if (SymbolicName.equals("OCT")) {
                    SymbolicName = "INT";
                    text = "" + new BigInteger(text, 8);
                }
                if (SymbolicName.equals("HEX")) {
                    SymbolicName = "INT";
                    text = "" + new BigInteger(text.substring(2), 16);
                }
                if (SymbolicName.equals("FLOAT")) {
//                    DecimalFormat decimalFormat = new DecimalFormat(".000000");
//                    text = decimalFormat.format(Float.parseFloat(text));
                    text = String.format("%.6f", new BigDecimal(text));
                }
                System.err.println(SymbolicName + " " + text + " at Line " + line + ".");
            }
        }
    }
}