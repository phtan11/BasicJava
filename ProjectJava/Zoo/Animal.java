package ProjectJava.Zoo;

import java.util.Scanner;

public abstract class Animal {
    String ten;
    int tuoi;
    String mota;
    public Animal() {} // contraction
    public Animal(String ten) {
        this.ten = ten;
    }
    public Animal(String ten,int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }
    public Animal(String ten,int tuoi,String mota) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.mota = mota;
    }
    public String getTen() {return ten;}
    public void setTen(String ten) {this.ten = ten;}
    public int getTuoi() {return tuoi;}
    public void setTuoi(int tuoi){this.tuoi = tuoi;}
    public String getMota() {return mota;}
    public void setMota(String mota) {this.mota = mota;}
    public void Show(){
        System.out.println("Animal[ten =" + this.ten +",tuoi =" + this.tuoi + ",mota =" + this.mota);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten:");
        ten = sc.nextLine();
        System.out.print("Nhap tuoi:");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap mo ta con vat:");
        mota = sc.nextLine();
    }
    public abstract void tiengKeu();
}
