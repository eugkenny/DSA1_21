package dsa.util;

public class ArrayQueueOfObjects implements QueueOfObjects{

    Object [] queue;
    int head, tail;
    int size;

    public ArrayQueueOfObjects(){
        queue = new Object[5];
        head = tail = 0;
    }

    @Override
    public void enqueue(Object o) {

    }

    @Override
    public Object dequeue() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
