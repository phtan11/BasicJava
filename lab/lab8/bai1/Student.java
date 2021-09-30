package bai1;
public class Student extends Person {
    private double score;
    public Student(){
        super();
    }
    public Student(String id,String name,int birthYear,double score){
        super(id,name,birthYear);
        this.score = score;
    }
    public double getScore(){
        return this.score;
    }
    public void setScore(double score){
        this.score = score;
    }
    @Override
    public String toString(){
        return "Student{"+super.toString()+"," + getScore() + "]";
    }
}
