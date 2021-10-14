package dsa.util;

public interface QueueOfObjects {
    void enqueue(Object o);
    Object dequeue();
    boolean isEmpty();
    int size();
}
