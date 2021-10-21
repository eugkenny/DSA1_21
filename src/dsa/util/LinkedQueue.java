package dsa.util;

public class LinkedQueue<E> implements Queue<E>{

    private class Node{
        E data;
        Node next;

        Node(E data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    Node head;
    Node tail;
    int size;

    public LinkedQueue(){
        head = tail = null;
    }

    @Override
    public void enqueue(E element) {
        Node oldTail = tail;
        tail = new Node(element, null);
        if(isEmpty()){
            head = tail;
        }
        else {
            oldTail.next = tail;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if(this.isEmpty()){
            System.out.println("Empty stack you fool");
        }
        E data = head.data;
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
