package SuffixTree;

import java.util.ArrayList;

public class Node implements NodeInterface {
    Node[] children;
    ArrayList<Integer> indices;
    String value;
    boolean isWord;
    LinkedNode linkedNode;
    KeyNode keyNode;

    public Node(){
        children = new Node[26]; //Node with the size of the alphabet
        indices = new ArrayList<Integer>(0);
    }


    public Node[] getChildren() {
        return children;
    }

    public void setChildren(Node[] children) {
        this.children = children;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public LinkedNode getLinkedNode() {
        return linkedNode;
    }

    public void setLinkedNode(LinkedNode linkedNode) {
        this.linkedNode = linkedNode;
    }

    public KeyNode getKeyNode() {
        return keyNode;
    }

    public void setKeyNode(KeyNode keyNode) {
        this.keyNode = keyNode;
    }

    public void addChild(char value) {
        if(value < 'a' || value > 'z'){
            return; //not a valid character
        } else {
            Node node = new Node();
            children[value - 'a'] = node;
        }
    }

    public Node getChild(char value) {
        if(value < 'a' || value > 'z'){
            return null;
        }
        return children[value - 'a'];
    }

    public void addIndex(int index) {
        indices.add(index);
    }

    public ArrayList<Integer> getIndices() {
        return indices;
    }
}

