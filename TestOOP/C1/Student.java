package C1;
import java.util.Scanner;
public class Student extends Person {
    private String MSSV;
    private double DTB;
    private String email;
    public Student(){
        super();
    }
    @Override
    public void inputInfor(){
        super.inputInfor();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap MSSV :" );
        while(true){
            String SV = sc.nextLine();
            Boolean check = setMSSV(SV);
            if(check == true){
                break;
            }
        }
        System.out.print("nhap Diem Trung Binh :" );
        //while(setDTB(Double.parseDouble(sc.nextLine()))); // rut gon va dung Double tranhs loior
        while(true){
            boolean ktra = setDTB(Double.parseDouble(sc.nextLine()));
            if(ktra){
                break;
            }
        }
        System.out.print("nhap email :" );
        // while(setEmail(sc.nextLine())); C1
        while(true){
            boolean checkee = setEmail(sc.nextLine());
            if(checkee){
                break;
            }
        }
    }
    @Override
    public void showInfor(){
        super.showInfor();
        System.out.println(",MSSV = "+MSSV +",DTB = "+DTB + ",Email = "+email +".");
    }
    public boolean checkScholarship(){
        if(DTB >= 8.0) return true;
        return false;
    }
    public String getMSSV(){
        return this.MSSV;
    }
    public double getDTB(){
        return this.DTB;
    }
    public String getEmail(){
        return this.email;
    }
    public boolean setMSSV(String MSSV){
        if(MSSV != null && MSSV.length() == 8){
        this.MSSV = MSSV;
        return true;
        }
        else{
            System.err.print("nhap lai Ma so SInh vien di bitch:");
            return false;
        }
    }
    public boolean setDTB(double  DTB){
        if(DTB >=0.0 && DTB <= 10.0){
        this.DTB = DTB;
        return true;
        }
        else{
            System.err.print("nhap lai dtb:");
            return false;
        }
    }
    public Boolean setEmail(String email){
        if(email != null && !email.contains(" ") && email.contains("@")){
            this.email = email;
            return true;
        }
        else{
            System.err.println("nhap lai email:");
            return false;
        }
   }
}
