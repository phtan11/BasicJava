package ProjectJava.CarParkingMan;

import java.util.Scanner;

public class People {
    String id;
    String name;
    int age;
    String address;
    String gender;
    int year;
    public People() {}
    public People(String id, String name, int age, String address, String gender, int year) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.year = year;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id:");
        id = sc.nextLine();
        System.out.println("nhap name:");
        name = sc.nextLine();
        System.out.println("nhap age:");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("nhap address:");
        address = sc.nextLine();
        System.out.println("nhap gender:");
        gender = sc.nextLine();
        System.out.println("nhap year:");
        year = Integer.parseInt(sc.nextLine());
    }
    public void Output(){
        System.out.println("People:id =" + id +",name = " + name +",age = " + age + ",addresss" +address +",gender = " + gender +",year = " + year );
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    
}