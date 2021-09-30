package lab6.bai6;
class Employee {
    private String ID;
    private String fullName;
    private int yearJoined;
    private double coefficientsSalary;
    private int numDayOff;
    public Employee(){
        this.ID = "0";
        this.fullName ="";
        this.yearJoined  = 2020;
        this.coefficientsSalary = 1.0;
        this.numDayOff =0;
    }
    public Employee(String ID,String fullName,double coefficientsSalary){
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = 2020;
        this.coefficientsSalary = coefficientsSalary;
        this.numDayOff = 0;
    }
    public Employee(String ID,String fullName,int yearJoined,double coefficientsSal,int numDayOff){
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSal;
        this.numDayOff = numDayOff;
    }
    public String getID(){
        return this.ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public String getFullName(){
        return this.fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public int getYearJoined(){
        return this.yearJoined;
    }
    public void setYearJoined(int yearJoined){
        this.yearJoined = yearJoined;
    }
    public int getNumDayOff(){
        return this.numDayOff;
    }
    public void setNumDayOff(int numDayOff){ this.numDayOff = numDayOff;}
    public double getCoefficient(){
        return this.coefficientsSalary;
    }
    public void setCoefficient(double coefficientsSalary){
        this.coefficientsSalary = coefficientsSalary;
    }
    public double getSeniority(){
       if(2021 - this.yearJoined >=5) return (2021 - this.yearJoined)*1150/100.0;
       else return 0;
    }
    public String considerEmulation(){
        if(this.numDayOff <= 1) return "A";
        else if(this.numDayOff >= 2 && this.numDayOff <= 3) return "B";
        else 
        return "C";
    }
    public double getSalary(){
        double emulation;
        if(this.numDayOff <=1)
        emulation = 1.0;
        else if(this.numDayOff >=2 && this.numDayOff <=3)
        emulation = 0.75;
        else 
        emulation = 0.5;
        return 1150 + 1150*(this.coefficientsSalary + emulation)+getSeniority();
    }
    public double getEmulation(){
        double emulation;
        if(this.numDayOff <=1)
        emulation = 1.0;
        else if(this.numDayOff >=2 && this.numDayOff <=3)
        emulation = 0.75;
        else 
        emulation = 0.5;
        return emulation;
    }
    @Override
    public String toString(){
        return "Employee[" + getID() + "," + getFullName() + ","+ getYearJoined() + "," + getCoefficient() + "," + getNumDayOff() + "]";
    }
}
