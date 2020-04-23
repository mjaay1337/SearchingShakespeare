package search_shakespeare;

abstract class Node<T> implements Iterable<Pair<Key, T>> {

    
    abstract Node<T> add(Key key, T action);
    
    abstract T find(Key key);

    abstract Node<T> locate(Key key);

}
