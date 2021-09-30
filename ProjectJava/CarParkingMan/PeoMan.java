package ProjectJava.CarParkingMan;

import java.util.ArrayList;
import java.util.Scanner;

public class PeoMan {
    ArrayList<People> peo = new ArrayList<People>();
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so chu xe:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            People p = new People();
            p.Input();
            peo.add(p);
        }
    }
}
