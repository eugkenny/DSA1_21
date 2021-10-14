package dsa.util;

public class LinkedStackOfStrings implements StackOfStrings {

    private class Node{
        String data;
        Node next;

        Node(String data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    Node top;
    int size;

    public LinkedStackOfStrings(){
        top = null;
    }

    @Override
    public void push(String s) {
        Node oldTop = top;
        top = new Node(s, oldTop);
        size++;
    }

    @Override
    public String pop() {
        if(this.isEmpty()){
            System.out.println("Empty stack you fool");
        }
        String data = top.data;
        top = top.next;
        size--;
        return data;
    }

    @Override
    public String peek() {
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
}
