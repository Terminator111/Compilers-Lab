package L3;

public enum ErrorType {
    UNDEFINED_VAR(1),
    UNDEFINED_FUN(2),
    REDEFINED_VAR(3),
    REDEFINED_FUN(4),
    MISMATCHED_ASSIGN(5),
    MISMATCHED_LEFT_HAND(6),
    MISMATCHED_OPE(7),
    MISMATCHED_RET(8),
    MISMATCHED_ARGS(9),
    NOT_ARRAY(10),
    NOT_FUN(11),
    NOT_INT(12),
    ILLEGAL_DOT(13),
    NONEXISTENT_FIELD(14),
    REDEFINED_FIELD(15),
    DUPLICATED_STRUCT(16),
    UNDEFINED_STRUCT(17);

    private final int value;

    ErrorType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
