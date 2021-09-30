package bai1;

public class Student extends Person{
    private double Score;
    public Student(){
        super();
    }
    public Student(String id,String name,int BirthYear,double Score){
        super(id,name,BirthYear);
        this.Score= Score;
    }
    public double getScore(){
        return this.Score;
    }
    public void setScore(double Score){this.Score=Score;}
    @Override
    public String toString(){
        return "Student{" + super.toString() + "," + getScore() +"}";}
}
