package L3;

public class SymbolTable {
    private static SymbolTable instance; // 共同维护一个全局符号表
    private final int HASH_TABLE_SIZE = 100;
    private HashNode hashTable[];

    private SymbolTable() {
        hashTable = new HashNode[HASH_TABLE_SIZE];
        for (int i = 0; i < HASH_TABLE_SIZE; i++) {
            hashTable[i] = new HashNode();
        }
    }

    private int getHashIndex(String name) {
        int val = 0, i;
        for (char c : name.toCharArray()) {
            val = (val << 2) + (int) c;
            // HASH_TABLE_SIZE描述了符号表的大小⼩
            if ((i = (val & ~(HASH_TABLE_SIZE - 1))) != 0) {
                val = (val ^ (i >> 12)) & (HASH_TABLE_SIZE - 1);
            }
        }
        return val;
    }

    public static SymbolTable getInstance() {
        if (instance == null) {
            instance = new SymbolTable();
        }
        return instance;
    }

    /**
     * 填表
     */
    public void fill(String name, Type type) {
        int index = getHashIndex(name);
        HashNode node = hashTable[index];
        // 为了方便，让每个索引的表头节点都为空，统一从next开始存值
        while (node.next != null) {
            node = node.next;
        }
        node.next = new HashNode(name, type);
    }

    /**
     * 查表，返回 Type，若未查到则返回 null
     */
    public Type seek(String name) {
        Type type = null;
        int index = getHashIndex(name);
        HashNode node = hashTable[index];
        while (node.next != null) {
            node = node.next;
            if (node.name.equals(name)) {
                type = node.type;
                break;
            }
        }
        return type;
    }

    /**
     * 替换
     */
    public void replace(String name, Type type) {
        int index = getHashIndex(name);
        HashNode node = hashTable[index];
        // 为了方便，让每个索引的表头节点都为空，统一从next开始存值
        while (node.next != null) {
            if (node.next.name.equals(name)) {
                node.next.type = type;
                break;
            }
            node = node.next;
        }
    }
}
