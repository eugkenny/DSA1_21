package dsa.employee;
public class SalaryWorker extends Employee{

    public SalaryWorker(String name, int id, double salary){
        super(name, id);
        earnings = salary;
    }
    @Override
    public double earnings() {
        return earnings;
    }
}
