package search_shakespeare;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import utilities.ArrayIterator;


public class ArrayNode<T> extends Node<T> {

    Node<T>[] arrayNode;

    public ArrayNode(Key key) {
        this.arrayNode = new Node[key.getMax() + 1];

        for (int i = 0; i < this.arrayNode.length; i++) {
            this.arrayNode[i] = null;
        }
    }

    public ArrayNode(Key key, T action) {

        this.arrayNode = new Node[key.getMax() + 1];

        for (int i = 0; i < this.arrayNode.length; i++) {
            this.arrayNode[i] = null;
        }

        this.arrayNode[key.getIndex()] = new KeyNode(key.getNext(), action);
    }

    @Override
    Node<T> add(Key key, T action) {
        Node t = arrayNode[key.getIndex()];
        if (t == null) {
            arrayNode[key.getIndex()] = new KeyNode(key.getNext(), action);
        } else {
            arrayNode[key.getIndex()] = t.add(key.getNext(), action);
        }
        return this;
    }

    @Override
    T find(Key key) {
        if (arrayNode[key.getIndex()] != null) {
            return (T) arrayNode[key.getIndex()].find(key.getNext());
        }
        return null;
    }

    @Override
    Node<T> locate(Key key) {
        if (key.getLength() == 0) {
            return this;
        } else {
            return arrayNode[key.getIndex()].locate(key.getNext());
        }
    }

    @Override
    public Iterator<Pair<Key, T>> iterator() {
        // remove possible null values
        Node[] withoutNullArray = Arrays.stream(this.arrayNode).filter(Objects::nonNull).toArray(Node[]::new);
        ArrayIterator ai = new ArrayIterator(withoutNullArray, 0, withoutNullArray.length);
        return ai;
    }

    
    
    @Override
    public String toString() {
        return "jeff";
    }

}
