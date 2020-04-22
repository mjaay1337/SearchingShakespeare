package SuffixTree;

import java.util.ArrayList;

public interface NodeInterface {
    void addChild(char value);
    Node getChild(char value);
    void addIndex(int index);
    ArrayList<Integer> getIndices();

}
