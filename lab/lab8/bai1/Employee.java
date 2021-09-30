package bai1;
public class Employee extends Person {
    private double Salary;
    public Employee(){
        super();
    }
    public Employee(String id,String name,int birthYear,double salary){
        super(id,name,birthYear);
        this.Salary = salary;
    }
    public double getSalary(){
        return this.Salary;
    }
    public void setSalary(double salary){
        this.Salary = salary;
    }
    @Override
    public String toString(){
        return "Employee[" +getId() +"," + getName() + "," + getBirthYear()+"," + getSalary() + "]";
    }
}
