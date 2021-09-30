package bai1;
public abstract class Person {
    private String id;
    private String name;
    private int birthYear;
    public Person(){ }
    public Person(String id,String name,int birthYear) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getBirthYear(){
        return this.birthYear;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    @Override
    public String toString(){
        return "Person{" + getId() +"," + getName() + "," + getBirthYear() + "]";
    }
}
