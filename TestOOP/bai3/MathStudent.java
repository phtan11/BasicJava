package bai3;

public class MathStudent extends Student {
    private String type;
    public MathStudent(){
        super();
    }
    public MathStudent(String sName,double gpa,String type){
        super(sName,gpa);
        this.type = type;
    }
    public String GetType(){
        return this.type;
    }
    public void SetType(String type){this.type = type;}
    @Override
    public String getRank(){
        if(getGpa() >= 5) {
            return "Passed";
        }
        else
        return "Failed";
    }
    @Override
    public String toString(){
        return super.toString() + "," + GetType() + "," + getRank();
    }
}
