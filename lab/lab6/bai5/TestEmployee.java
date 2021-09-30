package lab6.bai5;
public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1);
        Employee empl2 = new Employee("520H418","Tan",1.2);
        System.out.println(empl2);
        Employee empl3 = new Employee("520H418","Pham",2020,4.2,0);
        System.out.println(empl3);
    }
}
