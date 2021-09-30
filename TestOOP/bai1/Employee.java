package bai1;

public class Employee extends Person {
    private double salary;
    public Employee() {super();}
    public Employee(String id,String name,int BirthYear,double salary) {
        super(id,name,BirthYear);
        this.salary = salary;
    }
    public double getSalary() {return this.salary;}
    public void setSalary(double salary){this.salary = salary;}
    @Override
    public String toString() {
        return "Employee[" +super.toString() + "," + getSalary()+"]";
    }
}
