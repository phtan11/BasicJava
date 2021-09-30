package bai2;
import java.util.ArrayList;
public class Program {
    public static ArrayList<Point> find (ArrayList<Point> list){
        ArrayList<Point> newJ = new ArrayList<Point>();
        double distance =0.0;
        for(Point x:list){
            distance = Math.sqrt(x.getX()*x.getX() + x.getY()*x.getY());
            if(distance <= 1){
                newJ.add(x);
            }
        }
        return newJ;
    }
    public static void print(ArrayList<Point> list){
        for(Point f : list){
            System.out.println(f);
        }
    }
    public static void main(String[] args){
        ArrayList<Point> s1 = new ArrayList<Point>();
        s1.add(new Point(1,2));
        s1.add(new Point(0,1));
        s1.add(new Point(1,3));
        s1.add(new Point(2,0));
        s1.add(new Point(4,2));
        s1.add(new Point(0,3));
        print(s1);
        System.out.println();
        ArrayList<Point> c = find(s1);
        print(c);
    }
}
