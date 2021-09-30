package bai1;
public abstract class Person{
    private String id;
    private String name;
    private int BirthYear;
    public Person(){}
    public Person(String id, String name, int BirthYear)
    {
        this.id = id;
        this.name = name;
        this.BirthYear = BirthYear;
    }
    public String getId(){return this.id;}
    public void setId(String id){
        this.id = id;
    }
    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}
    public int getBirthYear(){return this.BirthYear;}
    public void setBirthYear(int BirthYear){this.BirthYear = BirthYear;}
    @Override
    public String toString(){
        return "Person{" + getId() + "," + getName() + "," + getBirthYear() + "]";
    }
}