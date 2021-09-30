package bai1;
import java.util.ArrayList;
public class PersonModel <T> {
    private ArrayList<T> list = new ArrayList<T>();
    public void add(T obj) {
        list.add(obj);
    }
    public void display() {
        for (T obj : list) {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        PersonModel<Student> model =  new PersonModel<Student>();
        Student s1 = new Student("520","tan",2002,5.3); //cach 1
        model.add(s1);
        model.add(new Student("520H","hao",2002,8.7)); // cach 2
        model.display();

        System.out.println();
        PersonModel<Employee> model2 = new PersonModel<Employee>();
        model2.add(new Employee("20H", "nghia", 2002,120000));
        model2.add(new Employee("2045", "anh ngoc", 2002, 4555555));
        model2.display();
        
    }
}