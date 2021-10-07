package dsa.employee;

public class HourlyWorker extends Employee {

    private int hours;
    private double rate;

    public HourlyWorker(String name, int id, int hours, double rate){
        super(name,id);
        this.hours = hours;
        this.rate = rate;
    }
    @Override
    public double earnings() {
        earnings = hours*rate;
        return earnings;
    }
}
