package SuffixTree;

public interface CTrieInterface<T> {
     T add(Key key, int value);
     int find(Key key);
     Node locate(Key key);
}
