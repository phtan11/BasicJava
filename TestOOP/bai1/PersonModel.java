package bai1;

import java.util.ArrayList;
public class PersonModel <T> {
    private ArrayList<T> al = new ArrayList<T>();
    public void add(T obj) {
        al.add(obj);
    }
    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        PersonModel<Person> s1 = new PersonModel<Person>();
        s1.add(new Student("520H", "Tan", 2002,7.5));
        s1.display();
    }
}
