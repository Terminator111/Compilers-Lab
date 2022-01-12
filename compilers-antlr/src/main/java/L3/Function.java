package L3;

public class Function extends Type {
    public Type returnType;
    public FieldList paramList;

    public Function() {
        this.kind = Kind.FUNCTION;
    }

    public Function(Type returnType, FieldList paramList) {
        this.returnType = returnType;
        this.paramList = paramList;
        this.kind = Kind.FUNCTION;
    }
}