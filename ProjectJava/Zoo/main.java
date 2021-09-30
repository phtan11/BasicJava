package ProjectJava.Zoo;

import java.util.Scanner;

public class main {
    public static void menu(){
        System.out.println("1.Them Chuong");
        System.out.println("2.Xoa chuong");
        System.out.println("3.Them con vat");
        System.out.println("4.Xoa con vat");
        System.out.println("5.Xem tat ca con vat...");
        System.out.println("6.thoat");
    }
    public static void addAnimal(Zooo z){
        Animal aa;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Tiger");
        System.out.println("2.Dog");
        System.out.println("3.Cat");
        System.out.println("enter animal which you want to add:");
        int chooo = Integer.parseInt(sc.nextLine());
        switch(chooo){
            case 1:
                aa = new Tiger();
                break;
            case 2:
                aa = new Dog();
                break;
            case 3:
            aa = new Cat();
            break;
            
        }
         //aa.input();
        System.out.println("==Chuong List===");
        Chuong ch= null;
        for(int i=0; i< z.getChuongList().size();i++){
            System.out.println("ma chuong:" + z.getChuongList().get(i).getmaChuong());
        }
        System.out.println("chon 1 chuong:");
        int cj = Integer.parseInt(sc.nextLine());
        for(int i=0; i< z.getChuongList().size();i++){
            if(z.getChuongList().get(i).getmaChuong() == cj){
                break;
            }
            else{
                ch = null;
            }
        }
    }
    public static void main(String[] args){
        Zooo zo = new Zooo();
        Chuong ss = new Chuong();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
        menu();
        System.out.println("Your choice:");
        choice = Integer.parseInt(sc.nextLine());
        switch(choice){
            case 1: // them chuong
                System.out.println("nhap so chuong muon them:");
                int n = Integer.parseInt(sc.nextLine());
                for(int i = 0; i < n; i++){
                    Chuong s = new Chuong();
                    s.input();
                    zo.themChuong(s);
                }
                break;
            case 2: // xoa chuong
                System.out.println("nhap ma chuong muon xoa:");
                int code= Integer.parseInt(sc.nextLine());
                zo.xoaChuong(code);
                break;
            case 3: // them con vat
                addAnimal(zo);
                break;
            case 4: // xpa con vat
                System.out.println("nhap ten con vat ma  ban muon xoa:");
                String nameAni = sc.nextLine();
                ss.xoaConVat(nameAni);
                break;
            case 5: // xem tat ca con vat 
                ss.display();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("may nhap sai roi djtmemay!!");
        }
    }while(choice!= 5);
    }
}
