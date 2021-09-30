interface Vegetable{
    public String getInfor();
}
class Carrot implements Vegetable{
    private String type = "Red carrot";
    public Carrot(){}
    @Override
    public String getInfor(){
        return "Carrot:"+type;
    }
}
class Cabbage implements Vegetable{
    private String type = "red Cabbage";
    private double weight = 4.5;
    public Cabbage(){}
    @Override
    public String getInfor(){return "Cabbage:" +type + "," + weight +"kg";}
}
class Pumpkin implements Vegetable{
    private double weight = 8.5;
    public Pumpkin(){}
    @Override
    public String getInfor(){return "Pumpkin:" + weight +"kg";}
}
class VegetableFactory{
    public VegetableFactory(){}
    public static Vegetable getVegetable(String type){
        switch(type){
            case "Carrot":
                return new Carrot();
            case "Cabbage":
                return new Cabbage();
            case "Pumpkin":
                return new Pumpkin();
            default:
                throw new IllegalArgumentException("this Vegetable has not here");
        }
    }
}
public class TestVegetableFactory {
    public static void main(String[] args){
        Vegetable v1 = VegetableFactory.getVegetable("Carrot");
        System.out.println(v1.getInfor());
        Vegetable v2 = VegetableFactory.getVegetable("Cabbage");
        System.out.println(v2.getInfor());
        Vegetable v3 = VegetableFactory.getVegetable("Pumpkin");
        System.out.println(v3.getInfor());
    }
}
