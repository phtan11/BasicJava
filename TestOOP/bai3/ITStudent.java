package bai3;

public class ITStudent extends Student {
    private int type;
    public ITStudent(){
        super();
    }
    public ITStudent(String sName,double gpa,int type){
        super(sName,gpa);
        this.type = type;
    }
    public int GetType(){
        return this.type;
    }
    public void SetType(int type){this.type = type;}
    @Override
    public String getRank(){
        if(getGpa() > 8 && getGpa() <= 10){
            return "A";
        } 
        else if(getGpa() > 5){
            return "B";
        }
        else{
            return "C";
        }
    }
    @Override
    public String toString(){
        return super.toString() + "," + GetType() +","+ getRank();
    }
}
