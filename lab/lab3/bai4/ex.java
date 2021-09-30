package lab3.bai4;
import java.util.*;
public class ex {
    public static int demnum(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.nextLine();
        System.out.println("Length of String is:" + str.length());
        System.out.println("the number of words in String:" + demnum(str));
        // noi chuoi!!!
        System.out.print("ENter a Strong that You want to contens:");
        String content = sc.nextLine();
        System.out.println("after contents:" + str.concat(content));
        String b = " ";
        for(int i = str.length() -1;i>=0;i--){ // lay ki tu tu vi tri cuoi!
            b = b + str.charAt(i); // lay ki tu o vi tri chuoi str roi gan vao b
        }
        if(str.equalsIgnoreCase(b)){ // so sanh 2 chuoi!!
            System.out.println("the String is a palindrome!!");
        }
        else
        System.out.println("the String isnt a palindrome!!");
    }
}
