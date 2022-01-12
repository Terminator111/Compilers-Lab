package L3;

public class HashNode {
    String name;
    Type type;
    // 链表解决hash冲突
    HashNode next;

    public HashNode() {
        this.name = null;
        this.type = null;
        this.next = null;
    }

    public HashNode(String name, Type type) {
        this.name = name;
        this.type = type;
        this.next = null;
    }
}
