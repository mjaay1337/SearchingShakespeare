package SuffixTree;

public class KeyNode implements CTrieInterface<LinkedNode>{
    Key key;
    int value;

    public KeyNode() {
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedNode add(Key key, int value) { //adds a new suffix to the trie
        LinkedNode ln = new LinkedNode();
        ln.setKey(key);
        return ln;
    }

    public int find(Key key) {
        return key.index;
    }

    public Node locate(Key key) {
        return null;
    }
}
