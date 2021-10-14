import dsa.util.*;
import dsa.employee.*;

public class TestQueue {
    public static void main(String[] args) {
        QueueOfObjects qoo = new LinkedQueueOfObjects();

        Employee joe = new HourlyWorker("Joe", 123, 10, 20.00);
        Employee jane = new SalaryWorker("Jane", 456, 30000.00);

        qoo.enqueue("A");
        qoo.enqueue("B");
        qoo.enqueue("C");
        qoo.enqueue("D");

        System.out.println("Is Empty?: " + qoo.isEmpty());
        System.out.println("Size: " + qoo.size());

        qoo.enqueue(joe);
        qoo.enqueue(jane);
        String s = (String)qoo.dequeue();

        System.out.println("Size: " + qoo.size());
        while(!qoo.isEmpty()){
            String s1 = (String)qoo.dequeue();
            System.out.print(s1);
        }
        System.out.println();

    }
}
