package L3;

public class Structure extends Type {
    public String name;
    public FieldList memberList;

    public Structure() {
        this.kind = Kind.STRUCTURE;
    }

    public Structure(String name, FieldList memberList) {
        this.name = name;
        this.memberList = memberList;
        this.kind = Kind.STRUCTURE;
    }

    @Override
    public boolean equals(Object o) {
        // fixme 成员数目，类型，顺序均需相同
        if (o instanceof Structure) {
            if (this.memberList == null && ((Structure) o).memberList == null) {
                return true;
            }
            if (this.memberList == null || ((Structure) o).memberList == null) {
                return false;
            }
            return this.memberList.equals(((Structure) o).memberList);
        }
        return super.equals(o);
    }
}
