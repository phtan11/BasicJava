package lab6.bai6;

class Manager extends Employee{
    private String Position;
    private String Department;
    private double salarycoefficientPosition;
    public Manager(){
        super();
        this.Position = "head of the office";
        this.Department = "at the administrative office ";
        this.salarycoefficientPosition = 5.0;
    }
    public Manager(String ID,String fullName,double coefficientSalary,String position,double salarycoefficientPosition){
        super(ID,fullName,2020,coefficientSalary,0);
        this.Position = position;
        this.Department ="at the administrative office ";
        this.salarycoefficientPosition = salarycoefficientPosition;
    }
    public Manager(String ID,String fullName,int yearJoined,double coefficientSalary,int numDayOff,String position,String Department,double salarycoefficientPosition){
        super(ID,fullName,yearJoined,coefficientSalary,numDayOff);
        this.Position = position;
        this.Department = Department;
        this.salarycoefficientPosition = salarycoefficientPosition;
    }
    public String getPosition(){
        return this.Position;
    }
    public void setPosition(String position){
        this.Position = position;
    }
    public String getDepartment(){
        return this.Department;
    }
    public void setDepartment(String department){
        this.Department = department;
    }
    public double getSalarycoefficientPosition() {
        return salarycoefficientPosition;
    }
    public void setSalarycoefficientPosition(double salarycoefficientPosition) {
        this.salarycoefficientPosition = salarycoefficientPosition;
    }
    @Override
    public String considerEmulation(){
        return "Employee[" + getID() + "," + getFullName() +"," + getYearJoined() + ","+considerEmulation() + "," + getCoefficient()+ "]";
    }
    public double bonusByPosition(){ // thuong chuc vuj
        return getSalarycoefficientPosition()*getSalary(); // luong co ban*chuc vu
    }
    @Override
    public double getSalary(){ // luong cua ng quan li.
        return (getSalary() +getSalary()*(getCoefficient() + getEmulation()) +getSeniority() + bonusByPosition());
    }
}
