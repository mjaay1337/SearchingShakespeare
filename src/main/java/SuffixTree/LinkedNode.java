package SuffixTree;

public class LinkedNode implements CTrieInterface<LinkedNode> {
    Key key;

    public LinkedNode() {
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public LinkedNode add(Key key, int value) {
        LinkedNode ln = new LinkedNode();
        ln.setKey(key);
        Key val = ln.getKey();
        val.setIndex(value);
        return ln;
    }

    public int find(Key key) {
        return key.index;
    }

    public Node locate(Key key) {
        return null;
    }
}
