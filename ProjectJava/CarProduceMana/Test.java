package ProjectJava.CarProduceMana;

public class Test {
    public static void main(String[] args){
        LuxuryCar myLuxuryCar = new LuxuryCar();
        myLuxuryCar.input();
        myLuxuryCar.getInfor();
        double total = myLuxuryCar.calculatePrice(20000);
        System.out.println("tong gia: " + total);
        double f = myLuxuryCar.calculatePrice();
        System.out.println("tong gia: " + f);
    }
}
