
package ProjectJava.CarProduceMana;

import java.util.Scanner;

public class Car implements ICar {
    private String name;
    private String producer;
    private int year;
    private int seat; // ghế
    private double rootPrice; // GIÁ gốc
    public Car(){}
    
    public Car(String name, String producer, int year, int seat, double rootPrice){
        this.name = name;
        this.producer = producer;
        this.year = year;
        this.seat = seat;
        this.rootPrice = rootPrice;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getSeat() {
        return seat;
    }
    public void setSeat(int seat) {
        this.seat = seat;
    }
    public double getRootPrice() {
        return rootPrice;
    }
    public void setRootPrice(double rootPrice) {
        this.rootPrice = rootPrice;
    }
    @Override
    public double calculateTax(){
        if(getSeat() <= 7){
            return (getRootPrice()*60)/100;
        }
        else{
            return (getRootPrice()*70)/100.0;
        }
    }
    @Override
    public double calculatePrice() {
        return getRootPrice() + calculateTax(); // totalPrice
    }
    @Override
    public void getInfor(){
        System.out.println(getName() + " Car produced by " + getProducer() + " in " + getYear() +" has " +getSeat() + " seats with the total price is " + calculatePrice() + "$");
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten:");
        name = sc.nextLine();
        System.out.println("nhap producer:");
        producer = sc.nextLine();
        System.out.println("nhap year:");
        try{
            year = Integer.parseInt(sc.nextLine());
        }catch(Exception e){
            System.out.println("may nhap nam sai roif: 'cause <=0");
        }
        System.out.println("nhap seat:");
        try{
            seat = Integer.parseInt(sc.nextLine());
        }catch(Exception e){
            System.out.println("ngu");
        }
        System.out.println("nhap rootPrice:");
        try{
            rootPrice = Double.parseDouble(sc.nextLine());
        }catch(Exception e){
            System.out.println("may nhap nam sai");
        }
    }

}
