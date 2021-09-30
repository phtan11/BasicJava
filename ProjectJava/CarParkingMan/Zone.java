package ProjectJava.CarParkingMan;

import java.util.ArrayList;
import java.util.Scanner;

public class Zone {
    ArrayList<Area> areA = new ArrayList<Area>();
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n khu vuc:");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            Area area = new Area();
            area.input();
            areA.add(area);
        }
    }
}

