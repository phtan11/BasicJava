package lab3.bai2;
import java.util.*;
public class ex1 {
    public static void printMatrix(int [][] a,int row,int col){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(a[i][j] +" ");
            }
                System.out.print("\n");
            }
    }
    public static int[][] AddTwoMatrix(int [][] a1,int [][] a2,int row,int column){
        int [][] addMatrix = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                addMatrix[i][j] = a1[i][j] + a2[i][j];
            }
        }
        return addMatrix;
    }
    public static int[][] MulMatrixNum(int [][] a1,int cow, int column,int num){
        int[][] mulMatrix = new int[cow][column];
        for(int i = 0;i<cow;i++){
            for(int j = 0 ;j<column;j++){
                mulMatrix[i][j] = a1[i][j] * num;
            }
        }
        return mulMatrix;
    }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row:"); // chieu doc !!
    int row = sc.nextInt();
    System.out.print("Enter col:"); // chieu ngang!!
    int column = sc.nextInt();
    int [][] a1 = new int[row][column];
    int [][] a2 = new int[row][column];
    // nhap matrix!!
    for(int i = 0;i<row;i++){
        for(int j = 0;j<column;j++){
            System.out.print("a1[" + i + "][" + j + "] = ");
            a1[i][j] = sc.nextInt();
        }
    }
    for(int i = 0;i<row;i++){
        for(int j = 0;j<column;j++){
            System.out.print("a2[" + i + "][" + j + "] = ");
            a2[i][j] = sc.nextInt();
        }
    }
    System.out.println("Maxtrix 1: ");
    printMatrix(a1,row,column);
    System.out.println("Maxtrix 2: ");
    printMatrix(a2,row,column);
    // CONG 2 MA TRAN!!
    System.out.println("ADD TWO MATRIX TOGETHER!!!");
    int[][] AddMat = AddTwoMatrix(a1,a2,row,column);
    System.out.println("Add two matrix: ");
    System.out.println("After add two maxtrix:");
    printMatrix(AddMat,row,column);
    //NHAN MA TRAN VOI 1 SO. SU DUNG MA TRAN A1!!!
    System.out.println("MULTIPLY A MATRIX WITH A NUMBER!!");
    System.out.print("Enter num that U want to mul with matrix 1: ");
    int num = sc.nextInt();
    int [][] mulm = MulMatrixNum(a1,row,column,num);
    System.out.println("last when multiply :");
    printMatrix(mulm,row,column);
   }
}
