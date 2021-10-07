import dsa.employee.*;

public class EmployeeTest {
    public static void main(String [] args){
        Employee emps [] = new Employee[2];

        emps[0] = new SalaryWorker("Joe", 123, 10000.00);
        emps[1] = new HourlyWorker("Mary", 456, 10, 20.00);

        for (Employee e : emps) {
            System.out.println("Name: " + e.name());
            System.out.println("ID: " + e.id());
            System.out.println("Earnings: " + e.earnings());
            System.out.println();
        }
    }
}
