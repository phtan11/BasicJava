package ProjectJava.Zoo;

import java.util.ArrayList;

public class Zooo {
    ArrayList<Chuong> ChuongList; // danh sách chuồng
    public Zooo() {
        ChuongList = new ArrayList<Chuong>();
    }
    public void themChuong(Chuong c){
        ChuongList.add(c);
    }
    public void xoaChuong(int maChuong){
        for(Chuong a : ChuongList){
            if(a.getmaChuong() == maChuong){
                ChuongList.remove(a);
            }
        }
    }
    public ArrayList<Chuong> getChuongList(){
        return ChuongList;
    }
    public void setChuongList(ArrayList<Chuong> a){
        this.ChuongList = a;
    }
    
}
