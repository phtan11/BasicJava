package ProjectJava.CarParkingMan;

import java.util.Scanner;

public class Vehicle {
    String producer; //  nguoi sAN xuat
    int biensoxe;
    int yearproduce; // ngay san xuat
    String IdofOwner; // id cua chu
    int length; // dai
    int wide; // rong
    public Vehicle() {
    }
    public Vehicle(String producer, int biensoxe, int yearproduce, String idofOwner, int length, int wide) {
        this.producer = producer;
        this.biensoxe = biensoxe;
        this.yearproduce = yearproduce;
        IdofOwner = idofOwner;
        this.length = length;
        this.wide = wide;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap produce:");
        producer = sc.nextLine();
        System.out.println("nhap biensoxe:");
        biensoxe = Integer.parseInt(sc.nextLine());
        System.out.println("nhap yearproduce:");
        yearproduce = Integer.parseInt(sc.nextLine());
        System.out.println("nhap IdofOwner:");
        IdofOwner = sc.nextLine();
        System.out.println("nhap length:");
        length = Integer.parseInt(sc.nextLine());
        System.out.println("nhap wide:");
        wide = Integer.parseInt(sc.nextLine());
    }
    public void Output(){
        System.out.println("Vehicle:Producer= " + producer + ",biensoxe=" + biensoxe +",yearproduce=" + yearproduce +",IdofOwner=" + IdofOwner + ",length=" + length + ",wide=" + wide);
    }
    public String getProducer() {return producer;}
    public void setProducer(String producer) {this.producer = producer;}
    public int getBiensoxe() {return biensoxe;}
    public void setBiensoxe(int biensoxe){this.biensoxe = biensoxe;}
    public int getYearproduce() {return yearproduce;}
    public void setYearproduce(int yearproduce){this.yearproduce = yearproduce;}
    public String getIdofOwner() {return IdofOwner;}
    public void setIdofOwner(String IdofOwner){this.IdofOwner = IdofOwner;}
    public int getLength() {return length;}
    public void setLength(int length){this.length = length;}
    public int getWide() {return wide;}
    public void setWide(int wide){this.wide = wide;}

}
