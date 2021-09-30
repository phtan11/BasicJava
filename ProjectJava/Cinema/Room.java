package ProjectJava.Cinema;

import java.util.Scanner;

public class Room extends Area {
    int total; // tong so ghe
    int num; // tong so ghe da ngoi
    public Room(){
        super("Phong xem phim");
    }
    public Room(int total, int num){
        super("Phong xem phim");
        this.total = total;
        this.num = num;
    }
    public int getTotal(){
        return total;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    @Override
    public void input(){
        // 
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tong so ghe:");
        total = sc.nextInt();
        System.out.println("nhap so ghe da ngoi:");
        num = sc.nextInt();
        setUp();
        
    }
    public void setUp(){ // num la so ghe da ngoi.. con total la tong so ghe
        if(num == 0){
            status = Area.STATUS.EMPTY;
        } else {
            int percent = ( num*100)/total; // kha nang lam tron
            //percent <25% la LESS
            // percent >=25% la NORMAL
            // percent >=70 la full
            if(percent >= 70){
                status = Area.STATUS.MORE;
            } else if(percent >= 25){
                status = Area.STATUS.NORMAL;
            }
            else {
                status = Area.STATUS.LESS;
            }
        }
        autoCurrent();
    }
}
