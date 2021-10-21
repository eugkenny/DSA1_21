package dsa.util;

import java.util.Iterator;

public class LinkedStack<E> implements Stack<E> {

   private class Node{
        E data;
        Node next;

        Node(E data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    Node top;
    int size;

    public LinkedStack(){
        top = null;
    }

    @Override
    public void push(E element) {
        Node oldTop = top;
        top = new Node(element, oldTop);
        size++;
    }

    @Override
    public E pop() {
        if(this.isEmpty()){
            System.out.println("Empty stack you fool");
        }
        E data = top.data;
        top = top.next;
        size--;
        return data;
    }

    @Override
    public E peek() {
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private class ListIterator implements Iterator<E>
    {
        private Node current = top;
        public boolean hasNext() { return current != null; }
        public void remove() { /* not supported */ }
        public E next()
        {
            E item = current.data;
            current = current.next;
            return item;
        }
    }
}
