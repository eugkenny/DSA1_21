package dsa.util;

public class LinkedQueueOfObjects implements QueueOfObjects{

    private class Node{
        Object data;
        Node next;

        Node(Object data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    Node head;
    Node tail;
    int size;

    public LinkedQueueOfObjects(){
        head = tail = null;
    }

    @Override
    public void enqueue(Object o) {
        Node oldTail = tail;
        tail = new Node(o, null);
        if(isEmpty()){
            head = tail;
        }
        else {
            oldTail.next = tail;
        }
        size++;
    }

    @Override
    public Object dequeue() {
        if(this.isEmpty()){
            System.out.println("Empty stack you fool");
        }
        Object data = head.data;
        head = head.next;
        size--;
        if(isEmpty()){
            tail = null;
        }
        return data;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }
}
