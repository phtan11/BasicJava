package bai3;

public class ITStudent extends Student {
    private int sID;
    public ITStudent(){
        super();
    }
    public ITStudent(int sID,String sName,double gpa){
        super(sName,gpa);
        this.sID = sID;
    }
    public int getsID(){return this.sID;}
    public void setID(int sID){this.sID = sID;}
    @Override
    public String getRank(){
        if(getGpa() > 8 && getGpa() <=10){
        return "A";
        }
        else if(getGpa() > 5) {
            return "B";
        }
        else{
            return "C";
        }
    }
    @Override
    public String toString(){
        return "ITStudent[" +getsID() + "," + super.toString() + ","+getRank() + "]";
    }
}
