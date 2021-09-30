package test;

import java.util.*;

public class nhapxuatArrandStr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    //     int n;
    //     System.out.print("enter element in array:");
    //     n=sc.nextInt();
    //     int[] a = new int[n];
    //     for(int i = 0;i<a.length;i++){
    //         System.out.print("Enter a["+i+"]=");
    //         a[i] = sc.nextInt();
    //     }
    //     for(int i=0;i<a.length;i++){
    //         System.out.println("a["+i+"] =" + a[i]);
    //     }
    //     System.out.print("max = "+findMax(a));
    // }
    // public static int findMax(int [] a){
    //     int max= a[0];
    //     for(int i=1;i<a.length;i++){
    //         if(a[i]>max){
    //             max = a[i];
    //         }
    //     }
    //     return max;

    // CHUOI!!!
    System.out.print("Enter name:");
    String name = sc.nextLine();
    System.out.println("do dai = "+ name.length()); // do dai
    System.out.println("thu tu ki tu = "+ name.charAt(2)); // in ki tu o vi tri thu 2
    System.out.println("noi chuoi = "+ name.concat(" dep trai!!")); // noi chuoi
    System.out.println("in ki tu bat dau tu 3 toi 9 la "+name.substring(0,3)); 
    if(name.equals("tan")) // ktra 2 String!!
        System.out.println("2 chuoi co = nhau!!");
    else
        System.out.println("2 chuoi khong = nhau!!");
    }
}
