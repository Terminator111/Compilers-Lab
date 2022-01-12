package L3;

public class Array extends Type {
    public Type elementType;
    public int elementNum;

    public Array() {
        this.kind = Kind.ARRAY;
    }

    public Array(Type elementType, int elementNum) {
        this.elementType = elementType;
        this.elementNum = elementNum;
        this.kind = Kind.ARRAY;
    }

    @Override
    public boolean equals(Object o) {
        // fixme 维度和基本类型相同 可以这么写吗？
        if (o instanceof Array) {
            return this.elementType.equals(((Array) o).elementType);
        }
        return super.equals(o);
    }
}
