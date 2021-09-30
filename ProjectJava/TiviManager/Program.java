package ProjectJava.TiviManager;

import java.util.Scanner;

public class Program {
    public static void menu(){
        System.out.println();
        System.out.println("1.Chuyen trang thai (switch)");
        System.out.println("2.chuyen trang thai kem theo kenh!!");
        System.out.println("3.Bat tivi");
        System.out.println("4.tat tivi");
        System.out.println("5.chuyen kenh ke tiep");
        System.out.println("6.chuyen kenh truoc");
        System.out.println("7.xem thong tin tivi");
        System.out.println("8.Exit");
    }
    public static void main(String[] args) {
        cTivi c1;
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("lua chon cach khoi tao:");
        System.out.println("1. Mac dinh"); // là tạo không đối số(những biến có khời tạo sẵn)
        System.out.println("2.Lua chon kenh"); // là tạo như 1 arraylist nhưng này là xài dân dã
        choice = Integer.parseInt(sc.nextLine());
        if(choice == 1){ // mac dinh
            c1 = new cTivi();
        }
        else{ // theo lua chon kenh
            System.out.println("Nhap so kenh ma ban muonn them:");
            int n = Integer.parseInt(sc.nextLine());
            String[] newTV = new String[n];
            for(int i=0; i<n; i++){
                System.out.print("nhap kenh thu " + (i+1) + ":");
                newTV[i] = sc.nextLine();
            }
            c1 = new cTivi(newTV);
        }

        do{
             menu();
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    c1.Switch();
                    break;
                case 2:
                    System.out.print("nhap ten can chuyen:");
                    String setChannel = sc.nextLine();
                    c1.Switch(setChannel);
                    break;
                case 3:
                    c1.On();
                    break;
                case 4:
                    c1.Off();
                    break;
                case 5: // next channel
                    c1.nextChannel();
                    break;
                case 6:    
                    c1.previousChannel();
                    break;
                case 7:
                    c1.Show();
                    break;
                case 8:
                System.exit(0);
            }
        }while(choice != 8);
    }
}
