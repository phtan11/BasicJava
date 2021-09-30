package bai3;
import java.util.ArrayList;
public class TestStudent {
    public static ArrayList<Student> findStudent(ArrayList<Student> list){
        ArrayList<Student> newJ = new ArrayList<Student>();
        for(Student s : list){
            if(s.getRank() =="A" || s.getRank() =="Passed"){
                newJ.add(s);
            }
        }
        return newJ;
    }
    public static void print(ArrayList<Student> list){
        for(Student s : list){
            System.out.println(s);
        }
    }
    public static void main(String[] args){
        ArrayList<Student> s1 = new ArrayList<Student>();
        s1.add(new ITStudent("tan",5.4,5555 ));
        s1.add(new ITStudent("tien",7.5,6666 ));
        s1.add(new ITStudent("hao",9.4,7777 ));
        s1.add(new MathStudent("anh D", 4.2,"ditme"));
        s1.add(new MathStudent("anh E", 7.5,"duma"));
        s1.add(new MathStudent("anh F", 9.5,"concainit"));
        print(s1);
        System.out.println();
        ArrayList<Student> oo = findStudent(s1);
        print(oo);
    }
}
