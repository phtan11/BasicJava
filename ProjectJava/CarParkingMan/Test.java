package ProjectJava.CarParkingMan;

import java.util.Scanner;

public class Test {
    public static void menu(){
        System.out.println();
        System.out.println("1.Nhap thog tin N people:");
        System.out.println("2.Nhap thog tin N Area -> save in zone:");
        System.out.println("3.Nhap thog tin N vehicle va tu dong tim kiem khu vuc phu hop de luu tru!!");
        System.out.println("4. hien thi thong tin cac xe dc chu so huu boi 1 nguoi theo ten:");
        System.out.println("5.dung giai thuat quick sort de xep giam dan theo dien tich cua xe trong tung khu vuc:");
        System.out.println("6.su dung ket qua 5 hien thi thog tin xe co trong zone do!!");
    }
    public static void main(String[] args){
        PeoMan peo = new PeoMan();
        Zone zon = new Zone();
        Scanner sc = new Scanner(System.in);
        System.out.println("chon:");
        int choice;
        do{
            menu();
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    peo.input();
                    break;
                case 2:
                    zon.input();
                    break;
                case 3:
                    
                case 4:
                case 5:
                case 6:
                default:
                    System.out.println("nhap loi1!");
                    break;
            }
        }while(choice != 7);
    }
}
