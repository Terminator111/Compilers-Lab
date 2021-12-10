package L2;

/**
 * 存储每个结点的信息
 */
public class NodeEntity {
    private int type; // 0表示语法单元，1表示词法单元
    private String name; // 语/词法单元的名称
    private int line; // 语法单元的行号
    private String text; // 词法单元需要额外打印的信息
    private int depth; // 在树中的深度，从0开始

    public NodeEntity() {
    }

    public NodeEntity(int type) {
        this.type = type;
    }

    /**
     * 语法单元的有参构造方法
     */
    public NodeEntity(int type, String name, int line, int depth) {
        this.type = type;
        this.name = name;
        this.line = line;
        this.depth = depth;
    }

    /**
     * 词法单元的有参构造方法
     */
    public NodeEntity(int type, String name, String text, int depth) {
        this.type = type;
        this.name = name;
        this.text = text;
        this.depth = depth;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getLine() {
        return line;
    }

    public String getText() {
        return text;
    }

    public int getDepth() {
        return depth;
    }
}
