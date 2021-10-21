import dsa.util.*;

public class TestStack {
    public static void main(String [] args){
        Stack<String> asos = new ArrayStack();

        asos.push("A");
        asos.push("B");
        asos.push("C");
        asos.push("D");

        System.out.println("Size: " + asos.size());
        System.out.println("Is Empty?: " + asos.isEmpty());

        String s = asos.pop();
        asos.push("E");
        asos.push("F");
        asos.push("G");

        System.out.println("Size: " + asos.size());
        while(!asos.isEmpty()){
            System.out.print(asos.pop() + ", ");
        }
        System.out.println();

        for (String item : asos) {
            System.out.print(item + ", ");
        }

        //asos.pop();
    }
}
