package lab7.bai1;

public class TestMovable {
    public static void main(String[] args){
        Movable n1 = new MovablePoint(2,2,3,3);
        System.out.println(n1);
        n1.moveUp(); // lam thay doi thang y
        System.out.println(n1); // no se ra cai y bang 2 + 3 = 5;
        System.out.println();

        Movable n2 = new MovableCircle(2,2,4,4,45);
        System.out.println(n2);
        n2.moveDown(); // lam giam thang y xuong/
        System.out.println(n2); // ra thang y = 2 -4 = -2(am 2)..
    }
}
