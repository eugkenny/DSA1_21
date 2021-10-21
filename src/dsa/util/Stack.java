package dsa.util;

public interface Stack<E> extends Iterable<E>{
    void push(E element);
    E pop();
    E peek();
    boolean isEmpty();
    int size();
}