package L3;

public class ErrorReporter {
    private static ErrorReporter instance;
//    private boolean state;

    private ErrorReporter() {
//        state = true; // 启动状态
    }

    public static ErrorReporter getInstance() {
        if (instance == null) {
            instance = new ErrorReporter();
        }
        return instance;
    }

//    public void start(){
//        state = true;
//    }
//
//    public void shut(){
//        state = false;
//    }
//
//    public boolean getState(){
//        return state;
//    }

    public void printError(ErrorType errType, int errLine, String text) {
//        if (!state) {
//            return;
//        }
        String errMsg = "";
        switch (errType) {
            case UNDEFINED_VAR:
                errMsg = String.format("Error type %d at Line %d: Undefined variable \"%s\".", errType.getValue(), errLine, text);
                break;
            case UNDEFINED_FUN:
                errMsg = String.format("Error type %d at Line %d: Undefined function \"%s\".", errType.getValue(), errLine, text);
                break;
            case REDEFINED_VAR:
                errMsg = String.format("Error type %d at Line %d: Redefined variable \"%s\".", errType.getValue(), errLine, text);
                break;
            case REDEFINED_FUN:
                errMsg = String.format("Error type %d at Line %d: Redefined function \"%s\".", errType.getValue(), errLine, text);
                break;
            case MISMATCHED_ASSIGN:
                errMsg = String.format("Error type %d at Line %d: Type mismatched for assignment.", errType.getValue(), errLine);
                break;
            case MISMATCHED_LEFT_HAND:
                errMsg = String.format("Error type %d at Line %d: The left-hand side of an assignment must be a variable.", errType.getValue(), errLine);
                break;
            case MISMATCHED_OPE:
                errMsg = String.format("Error type %d at Line %d: Type mismatched for operands.", errType.getValue(), errLine);
                break;
            case MISMATCHED_RET:
                errMsg = String.format("Error type %d at Line %d: Type mismatched for return.", errType.getValue(), errLine);
                break;
            case MISMATCHED_ARGS:
                errMsg = String.format("Error type %d at Line %d: Function \"%s\" is not applicable for arguments.", errType.getValue(), errLine, text);
                break;
            case NOT_ARRAY:
                errMsg = String.format("Error type %d at Line %d: \"%s\" is not an array.", errType.getValue(), errLine, text);
                break;
            case NOT_FUN:
                errMsg = String.format("Error type %d at Line %d: \"%s\" is not a function.", errType.getValue(), errLine, text);
                break;
            case NOT_INT:
                errMsg = String.format("Error type %d at Line %d: \"%s\" is not an integer.", errType.getValue(), errLine, text);
                break;
            case ILLEGAL_DOT:
                errMsg = String.format("Error type %d at Line %d: Illegal use of \".\".", errType.getValue(), errLine);
                break;
            case NONEXISTENT_FIELD:
                errMsg = String.format("Error type %d at Line %d: Non-existent field \"%s\".", errType.getValue(), errLine, text);
                break;
            case REDEFINED_FIELD:
                errMsg = String.format("Error type %d at Line %d: Redefined field \"%s\".", errType.getValue(), errLine, text);
                break;
            case DUPLICATED_STRUCT:
                errMsg = String.format("Error type %d at Line %d: Duplicated structure name \"%s\".", errType.getValue(), errLine, text);
                break;
            case UNDEFINED_STRUCT:
                errMsg = String.format("Error type %d at Line %d: Undefined structure \"%s\".", errType.getValue(), errLine, text);
                break;
        }
        System.err.println(errMsg);
    }

}
