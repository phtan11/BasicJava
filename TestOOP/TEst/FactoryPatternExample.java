package TEst;
interface Vehicle{
    public String move();
}
class Car implements Vehicle{
    public Car(){}
    @Override
    public String move(){
        return "Car is creating!!";
    }
}
class Truck implements Vehicle{
    public Truck(){}
    @Override
    public String move(){
        return "Truck is creating!!";
    }
}
class VehicleFactory{
    public VehicleFactory(){}
    public static Vehicle getVehicle(String shapeType){
        switch(shapeType){
            case "Car":
                return new Car();
            case "Truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("this vehicle is currently supported");
        }
    }
}
public class FactoryPatternExample {
    public static void main(String[] args){
        Vehicle v1 = VehicleFactory.getVehicle("Car");
        System.out.println(v1.move());
        Vehicle v2 = VehicleFactory.getVehicle("Truck");
        System.out.println(v2.move());
    }
}
