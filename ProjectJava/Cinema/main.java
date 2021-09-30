package ProjectJava.Cinema;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        List<Istatus> statusListt = new ArrayList<Istatus>();
        System.out.println("nhap 3 quay ban ve:");
        for(int i = 0; i < 3; i++){
            TicketCou tik = new TicketCou();
            tik.input();
            statusListt.add(tik); 
        }
        System.out.println("nhap 2 quay ban do an:");
        for(int i = 0; i < 2; i++){
            Food f = new Food();
            f.input();
            statusListt.add(f);
        }
        System.out.println("nhap 2 bai do xe:");
        for(int i = 0; i < 2; i++){
            Parking par =  new Parking();
            par.input();
            statusListt.add(par);
        }
        System.out.println("nhap 5 phong xem phim:");
        for(int i = 0; i < 5; i++){
            Room r = new Room();
            r.input();
            statusListt.add(r);
        }   
        System.out.println("hien thi thog tin trang thai:");
        followStatus(statusListt);
    }
    public static void followStatus(List<Istatus> statusList){
        for(Istatus s : statusList){
            s.onStatus();
        }
    }
}
