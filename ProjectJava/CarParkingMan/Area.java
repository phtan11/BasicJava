package ProjectJava.CarParkingMan;

import java.util.ArrayList;
import java.util.Scanner;

public class Area { // noi quan li khu vuc tung xe
    String Location; // vi tri cua khu vuc
    int length; // chieu dai cua khu vuc
    int wide; // chieu rong cua khu vuc
    ArrayList<Vehicle> carList = new ArrayList<Vehicle>();
    public Area(){}
    public void input(){
        Scanner sc = new Scanner(System
        .in);
        System.out.println("nhap vi tri cua khu vuc");
        Location = sc.nextLine();
        System.out.println("length:");
        length = Integer.parseInt(sc.nextLine());
        System.out.println("wide:");
        wide = Integer.parseInt(sc.nextLine());

    }
    public String getLocation() {return Location;}
    public void setLocation(String location) {this.Location = location;}
    public int getLength() {return length;}
    public void setLength(int length){this.length = length;}
    public int getWide() {return wide;}
    public void setWide(int wide){this.wide = wide;}
    
}
