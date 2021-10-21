package dsa.util;

public interface Queue<E> extends Iterable<E>{
    void enqueue(E element);
    E dequeue();
    boolean isEmpty();
    int size();
}