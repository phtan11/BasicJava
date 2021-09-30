package java.lab3.bai1;
import java.util.*;
public class ex1 {
    public static boolean DelTheFirt(int a[],int k){
        for(int i= 0; i<a.length;i++){
            if(k==a[i]){
                for (int j=i;j<a.length-1;j++){
                    a[j]=a[j+1];
                }
                return true;
            }
        }
        return false;
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
       System.out.print("Array:");
       for(int x:a){
           System.out.print(" " + x);
       }
       System.out.print("\nEnter k : ");
       int k = sc.nextInt();
       if(DelTheFirt(a,k) == true){
            System.out.print("\nlast delete Array:");
            for(int x:a){
                System.out.print(" " + x);
            }
       }
       else{
           System.out.print("\nkhong co!!");
       }
    }
}
