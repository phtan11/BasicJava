package ProjectJava.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Chuong { // chuồng
    int maChuong;
    ArrayList<Animal> AniList ;
    public Chuong(){
        AniList = new ArrayList<Animal>();
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma chuong:");
        maChuong = sc.nextInt();
    }
    public void themConVat(Animal a ){
        AniList.add(a);
    }
    public void xoaConVat(String ten){
        for(Animal a : AniList){
            if(a.getTen().equalsIgnoreCase(ten)){
                    AniList.remove(a);
            }
        }
    }
    public ArrayList<Animal> getAnimalList(){
        return AniList;
    }
    public void setAnimalList(ArrayList<Animal> a){
        this.AniList = a;
    }
    public int getmaChuong(){
        return this.maChuong;
    }
    public void setmaChuong(int maChuong){
        this.maChuong = maChuong;
    }
    public void display(){
        for(Animal a : AniList){
            a.Show();
            a.tiengKeu();
        }
    }
}
