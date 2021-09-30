package TEst;
class OuterClass{
    static int outer_x = 10; // has static
    int outer_y = 20; // non-static
    private int outer_private = 30; // private int
    class InnerClass{
        void display(){
            System.out.println("Outer x =" + outer_x); // static 
            System.out.println("Outer y =" + outer_y);// non static
            System.out.println("Outer private =" + outer_private); //  private
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args){ 
        /* 
            cais nayf dac biet hoi rac roi 
        */ 
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display();
    }
}
