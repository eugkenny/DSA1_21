package dsa.employee;

public abstract class Employee {
    private final String NAME;
    private final int ID;
    protected double earnings;

    public Employee(String name, int id){
        NAME = name;
        ID = id;
    }

    public String name(){
        return NAME;
    }

    public int id(){
        return ID;
    }

    public abstract double earnings();

}
