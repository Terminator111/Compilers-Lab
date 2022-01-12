package L3;

public abstract class Type {
    public Kind kind;

    @Override
    public boolean equals(Object o) {
        if (o instanceof Type) {
            return ((Type) o).kind == this.kind;
        }
        return super.equals(o);
    }
}
