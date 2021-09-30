package bai3;

public class MathStudent extends Student {
    private String sID;
    public MathStudent(){ super(); }
    public MathStudent(String sID,String sName,double Gpa){
        super(sName, Gpa);
        this.sID = sID;
    }
    public String getsID(){ return this.sID; }
    public void setID(String sID){this.sID = sID;}
    @Override
    public String getRank(){
        if(getGpa() >= 5){
            return "Passed";
        }
        else{
            return "Failed";
        }
    }
    @Override
    public String toString(){
        return "MathStudent[" + getsID() + super.toString() + "," + getRank() + "]";
    }
}
