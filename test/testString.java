package test;
//import java.util.*;
public class testString{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter name : ");
        // String name1 = sc.nextLine(); // in ra het dongg!!
        // System.out.println("name is : "+ name1);
        // System.out.print("Enter name2 : ");
        // String name2 = sc.next(); //  doc cho toi khoang trang!!
        // System.out.println("name2 is : "+ name2);
        // // name1 = name1.toUpperCase();
        // // name2 = name2.toUpperCase();
        // System.out.println("name1 is : "+ name1.toUpperCase());// in hoa
        // System.out.println("name2 is : "+ name2.toUpperCase()); // in hoa
        // System.out.println("lengh name1 is : "+ name1.length()); // do dai 
        // System.out.println("lengh name2 is : "+ name2.length()); // do dai
        
    
     String name1 = new String("pham phuoc tan");
        System.out.println("the first char name1 is : "+ name1.charAt(0)); // lay ki tu o vi tri 0
        System.out.println("char number of name1 is : "+ name1.indexOf("phuoc")); // in ra so thu tu cua "phuoc" cua tu p
        System.out.println("char of name1 is : "+ name1.substring(5,10)); // lay ra ki tu o vi tro so 14 toi 17 cach 1
        System.out.println("phuoc is : "+ name1.substring(name1.indexOf("phuoc"),name1.indexOf("phuoc") + 5)); // lay ra ki tu o vi tro so 14 toi 17 cach 2
        String newname = name1.concat("!tui den tu tra vinhh"); //similar strcat in C
        System.out.println("new name = " + newname); 
        if(name1.equals(newname)){
            System.out.println("similar!!");
        }
        else
        System.out.println("different");
        
        System.out.println("replace1 :" + name1.replace("pham","tui la")); // doitu "pham" thanh tui
        
        //System.out.println("split :" + name1.replace(name1,newname));

    /*
    -ham name1.toUpperCase la in hoa
    -ham name1.charAt(so vi tri) la in ra ki tu o vi tri nao do
    -ham name1.indexOf("ki tu") la in ra so vi tri cua ' k '
    - ham name1.substring(int1,int2) la in ra ki tu bat dau tu int1 toi int2
    -ham name1.substring(name1.indexOf("phuoc"),name1.indexOf("phuoc") + 5) la no in ra tu chu 'p' toi 'c'  la ra chu phuoc!!
    -ham name1.concat"("string") la ham noi chuoi.
    - ham name1.equals(newname) la so sanh!!
    -ham name1.replace("pham","tui la") co nghia la trong chuoi name 1 co "pham" va sau do se doi thanh"tui la
    */
    }
}