package dsa.util;

import java.util.Iterator;

public class ArrayStack<E> implements Stack<E> {

    E [] stack;
    int top;

    public ArrayStack(){
        stack = (E[])new Object[5];
        top = 0;
    }

    @Override
    public void push(E element) {
        if(top == stack.length){
            resize(stack.length * 2);
        }
        stack[top] = element;
        top++;
    }

    private void resize(int newCapacity) {
        E [] temp = (E[]) new Object[newCapacity];
        //System.arraycopy(stack, 0, temp, 0, stack.length);
        for(int i = 0; i < stack.length; i++){
            temp[i] = stack[i];
        }
        stack = temp;
    }

    @Override
    public E pop() {
        if(this.isEmpty()){
            System.out.println("Empty stack you fool");
        }
        E s = stack[top - 1];
        stack[top - 1] = null;
        top--;

        return s;
    }

    @Override
    public E peek() {
        return stack[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public Iterator<E> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<E> {
        private int i = top;
        public boolean hasNext() { return i > 0; }
        public void remove() { /* not supported */ }
        public E next() { return stack[--i]; }
    }
}

