package search_shakespeare;


public interface Key<T> {

    boolean includes(T other);

    int getMax();

    int getIndex();

    Key getNext();

    int getLength();

    String getText();
}