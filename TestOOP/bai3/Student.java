package bai3;

public abstract class Student {
    private String sName;
    private double gpa;
    public Student(){}
    public Student(String sName,double gpa){
        this.sName = sName;
        this.gpa = gpa;
    }
    public String getName(){
        return this.sName;
    }
    public void setName(String sName){
        this.sName = sName;
    }
    public double getGpa(){
        return this.gpa;
    }
    public void setGpa(double gpa){this.gpa = gpa;}
    public abstract String getRank();
    @Override
    public String toString(){
        return "{" + getName() +"," + getGpa() +"}" ;
    }
}
