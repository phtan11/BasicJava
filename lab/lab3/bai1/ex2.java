package lab3.bai1;
import java.util.*;
public class ex2 {
    public static void add(int a[],int val,int addr){
        for(int i=0;i<a.length;i++){
            if(i == addr){
                a[i+1] = a[i];
                a[i] = val;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter element:");
       int n = sc.nextInt();
       int [] a= new int[n];
       for(int i=0; i<n; i++){
           System.out.print("a[" + i + "] = ");
           a[i] = sc.nextInt();
       }
       System.out.print("Enter value want add :");
       int insert = sc.nextInt();
       System.out.print("Enter address element want add :");
       int element = sc.nextInt();
       add(a,insert,element);
       System.out.print("last when exchange:");
       for(int x:a){
        System.out.print(" " + x);
        }
    }
}
