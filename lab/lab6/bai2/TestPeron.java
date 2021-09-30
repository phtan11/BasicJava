package lab6.bai2;

public class TestPeron {
    public static void main (String[] args){
        Person nPer1 = new Person("Tan","502 Huynh Tan Phat");
        System.out.println(nPer1);
        System.out.println();
        Staff nSt = new Staff("Phuoc Tan","Huynh Tan Phat","TDTU",2.1);
        System.out.println(nSt);
        System.out.println();
        Student nSt1 = new Student("Pham","Binh thuan Ward","CLC",4,12.2);
        System.out.println(nSt1);
    }
}
