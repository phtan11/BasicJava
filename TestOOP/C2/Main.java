package C2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println();
        System.out.println("1.Enter information book:");
        System.out.println("2.Display the whole book on screen:");
        System.out.println("3.Enter information of author:");
        System.out.println("4.seach the whole book written by author:");
        System.out.println("5.exit");

    }
    public static void main(String[] args) {
        ArrayList<Author> AuthorList = new ArrayList<Author>(); // quan li tac gia
        ArrayList<Book> BookList = new ArrayList<Book>(); // QUAN LI BOOK
        int choose;
        Scanner scan = new Scanner(System.in);
        do{
            menu();
            do{
                System.out.println("Enter your choose:");
                choose = Integer.parseInt(scan.nextLine());
            }while(choose < 1 || choose > 5);
        switch(choose){
            case 1:
                int n;
                System.out.println("nhap so Book than U want to add:");
                n = Integer.parseInt(scan.nextLine());
                for(int i = 0;i<n;i++){
                    Book std = new Book();
                    std.inputInfor();
                    BookList.add(std);
                }
                break;
            case 2:
                for(Book s : BookList){
                    s.Display();
                }
                break;
            case 3:
                int n1;
                System.out.println("nhap so Author:");
                n1 = Integer.parseInt(scan.nextLine());
                for(int i = 0;i<n1;i++){
                    Author std = new Author();
                    std.inputInfor(AuthorList);
                    AuthorList.add(std);                    
                }
                break;
            case 4:
                System.out.println("Enter butdanh cua sach:");
                String nicName = scan.nextLine();
                for(int i = 0;i< BookList.size();i++){
                    if(BookList.get(i).getButDanhofBook().equalsIgnoreCase(nicName)){
                        BookList.get(i).Display();
                    }
                }
            case 5:
                System.exit(0);
                break;
        }
        }while(choose != 5);
    }
}
