package C1;
import java.util.Scanner;
class Person{
    private String name;
    private String gender;
    private String birthDate;
    private String address;
    public Person(){

    }
    public void inputInfor(){
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap ten:");
        name = scan.nextLine();
        System.out.print("nhap sex:");
        gender = scan.nextLine();
        System.out.print("nhap dayday:");
        birthDate = scan.nextLine();
        System.out.print("nhap dia chi:");
        address = scan.nextLine();
    }
    public void showInfor(){
        System.out.println("Name =" + name + ", gender =" + gender + ", birthDate =" + birthDate + ", address =" + address);
    }
    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    public String getBirthDate(){
        return this.birthDate;
    }
    public String getAddress(){
        return this.address;
    }
    public void setName(String name){
        this.name = name;
    }   
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    public void setAddress(String address){
        this.address = address;
    }
    @Override
    public String toString(){
        return "Person[" + getName() + ","+getGender() + ","+getBirthDate() + "," + getAddress() + "]";
    }
}