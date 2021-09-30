package lab3.bai3;
import java.util.*;
public class ex1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter name of a person 3 chu:");
        String name = sc.nextLine(); // vd: name :Pham phuoc tan
        int fistIndex = name.indexOf(" "); // nó nằm ở vị trí khoãng trống sau chữ 'm'
        int sencondIndex = name.indexOf(" ",fistIndex + 1); // nó nằm ở vị trí khoảng trống thứ 2 là ở chổ sau chữ 'c'
        // first name
        System.out.println("First Name :"+ name.substring(0,name.indexOf(' ')));
        // last NameS
        String LastName = name.substring(sencondIndex + 1);
        System.out.println("Last name:" + LastName);
        // middle name
        String middle = name.substring(fistIndex + 1, name.lastIndexOf(" ")); // cashc 2: name.substring(fistIndex + 1,sencondIndex);
        System.out.println("Middle name :" + middle);
        // middle cua nguyen thi thu thao -> in ra thi thu
        System.out.print("Enter name of a person 4 chu:"); // nguyen thi thu thao
        String name1 = sc.nextLine();
        int fistspace = name1.indexOf(" ");
        String Middletwoword = name1.substring(fistspace+1,name1.lastIndexOf(" "));
        System.out.println("Middle name 4 chu:" + Middletwoword);
        

        //// in hoa chu cai dau cua chuoi!!

    }
}
