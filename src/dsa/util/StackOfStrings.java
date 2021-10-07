package dsa.util;

public interface StackOfStrings {
    void push(String s);
    String pop();
    String peek();
    boolean isEmpty();
    int size();
}
