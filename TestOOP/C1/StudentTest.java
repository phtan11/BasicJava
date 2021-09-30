package C1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentTest {
    public static void showMenu(){
        System.out.println("1.nhap vao N sinh vien");
        System.out.println("2.show sinh vien");
        System.out.println("3.hien thi max min dtb");
        System.out.println("4.tim kieu theo mssv");
        System.out.println("5.sap xep A-Z theo ten SV va show");  
        System.out.println("6.hien thi SV dc hoc bogn va sort diem tb giam dan");  
        System.out.println("7.thoat");  
    }
    public static void main(String[] args){
        ArrayList<Student> stList = new ArrayList<Student>();
        Scanner inputt = new Scanner(System.in);
        int choose;
        do{
            showMenu();
            System.out.println("enter choose:");
            choose = Integer.parseInt(inputt.nextLine());
            switch(choose){
                case 1:
                    int n;
                    System.out.print("nhap so sinh vien:");
                    n = Integer.parseInt(inputt.nextLine());
                    for(int i = 0; i < n; i++){
                        Student std =  new Student();
                        std.inputInfor();
                        stList.add(std);
                    }
                    break;
                case 2:
                    for(int i = 0; i < stList.size(); i++){
                        stList.get(i).showInfor();
                    }
                    break;
                case 3:
                    int min_index = 0,max_index = 0;
                    double min = stList.get(0).getDTB();
                    double max = stList.get(0).getDTB();
                    for(int i = 1; i < stList.size(); i++){
                        if(stList.get(i).getDTB() < min){
                            min_index = i;
                            min = stList.get(i).getDTB();
                        }
                        if(stList.get(i).getDTB() > max){
                            max_index = i;
                            max = stList.get(i).getDTB();
                        }
                    }
                    System.out.println("dtb max: ");
                    stList.get(max_index).showInfor();
                    System.out.println("dtb min: ");
                    stList.get(min_index).showInfor();
                    break;
                case 4:
                    String searchMssv;
                    System.out.print("Enter MSSV that U want to search:");
                    searchMssv = inputt.nextLine();
                    int count = 0;
                    for(Student s: stList){
                        if(s.getMSSV().equalsIgnoreCase(searchMssv)){
                            s.showInfor();
                            count++;
                        }
                    }
                    if(count ==0){
                        System.out.println("Khong co SV nao co MSSV <" +searchMssv +">");
                    }
                    break;
                case 5:
                    //B1 Sap sep SV theo ten tu A->Z
                    Collections.sort(stList,new Comparator<Student>(){
                        @Override
                        public int compare(Student o1,Student o2){
                            int cmp = o1.getName().compareTo(o2.getName());
                            if(cmp >= 0) return 1;
                            return -1;
                        }
                    });
                    // hien this
                    
                    for(int i=0;i<stList.size(); i++){
                        stList.get(i).showInfor();
                        }
                    break;
                case 6:
                // sap xep diem trung binh
                Collections.sort(stList,new Comparator<Student>(){
                    @Override
                    public int compare(Student o1,Student o2){
                        return o1.getDTB() > o2.getDTB()?-1:1;
                    }
                });
                // hien this
                System.out.println("Sv dc nhan hoc bong:");
                for(int i=0;i<stList.size(); i++){
                    if(stList.get(i).checkScholarship()){
                        stList.get(i).showInfor();
                    }
                }
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }while(choose != 7);
    }
}