package ProjectJava.CarProduceMana;

import java.util.Scanner;

public class LuxuryCar extends Car {
    private double specialRate; // judge
    public LuxuryCar(){
        super();
    }
    public LuxuryCar(String name, String producer, int year, int seat, double rootPrice,double specialRate){
        super(name, producer, year, seat, rootPrice);
        this.specialRate = specialRate;
    }
    public double getSpecialRate() {
        return specialRate;
    }

    public void setSpecialRate(double specialRate) {
        this.specialRate = specialRate;
    }
    @Override
    public double calculatePrice(){
        return getRootPrice()+calculateTax()+ (getRootPrice() * getSpecialRate());
    }
    public double calculatePrice(double transportCost) {
        return getRootPrice()+calculateTax()+ (getRootPrice() * getSpecialRate())+transportCost;
    }
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap Rate mine:");
        try{
            specialRate = Double.parseDouble(sc.nextLine());
        }catch(Exception e){
            System.out.println("bot ngu lai1!");
        }
    }
}
