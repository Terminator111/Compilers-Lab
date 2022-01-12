package L3;

/**
 * 存储函数的参数以及结构体的成员
 */
public class FieldList {
    public String name;
    public Type type;
    public FieldList next;

    public FieldList() {
    }

    public FieldList(String name, Type type, FieldList next) {
        this.name = name;
        this.type = type;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        // fixme
        if (o instanceof FieldList) {
            FieldList fl1 = this;
            FieldList fl2 = ((FieldList) o);
            while (fl1.type.equals(fl2.type)) {
                if (fl1.next == null && fl2.next == null) {
                    return true;
                } else {
                    if (fl1.next == null || fl2.next == null) {
                        return false;
                    }
                    fl1 = fl1.next;
                    fl2 = fl2.next;
                }
            }
            return false;
        }
        return super.equals(o);
    }
}
