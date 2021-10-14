package dsa.util;

public class ArrayStackOfStrings implements StackOfStrings {

    String [] stack;
    int top;

    public ArrayStackOfStrings(){
        stack = new String[5];
        top = 0;
    }

    @Override
    public void push(String s) {
        if(top == stack.length){
            resize(stack.length * 2);
        }
        stack[top] = s;
        top++;
    }

    private void resize(int newCapacity) {
        String [] temp = new String[newCapacity];
        //System.arraycopy(stack, 0, temp, 0, stack.length);
        for(int i = 0; i < stack.length; i++){
            temp[i] = stack[i];
        }
        stack = temp;
    }

    @Override
    public String pop() {
        if(this.isEmpty()){
            System.out.println("Empty stack you fool");
        }
        String s = stack[top - 1];
        stack[top - 1] = null;
        top--;

        return s;
    }

    @Override
    public String peek() {
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
}
