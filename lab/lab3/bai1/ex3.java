package lab3.bai1;
import java.util.*;
public class ex3 {
    public static int[] trungnhau(int a[]){
        int[] bee = new int[a.length];
        for(int i= 0;i<bee.length;i++){
            for(int j = i+1;j<bee.length;j++){
                if(a[i] == a[j]){
                    bee[i] = a[i];
                }
            }
        }
        return bee;
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
       int [] zee = trungnhau(a);
       for(int x:zee){
           System.out.print(" "+ x);
       }
    }
}
