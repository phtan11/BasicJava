package lab3.bai1;
import java.util.*;
public class ex4 {
    public static int[] removeElement(int[] a,int index){
        int [] arr = new int[a.length - 1];
        for(int i = 0;i<a.length;i++){
            for(int k = 0;;){
                arr[k++] = a[i];
            }
        }
        return arr;
    }
    public static int[] remove(int a[]){
        int [] ate = new int[a.length-1];
        for(int i =0;i<ate.length - 1;i++){
            for(int j=i+1;j<ate.length;i++){
                if(ate[i] == ate[j]){ 
                    removeElement(a,j);
                }
            }
        }
            return ate;
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
       int[] ar = remove(a);
       for(int x:ar)
       System.out.print(" " + x);
    }
}
