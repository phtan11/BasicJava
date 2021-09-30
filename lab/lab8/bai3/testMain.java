package bai3;
import java.util.ArrayList;
public class testMain {
    public static ArrayList<Student> findStudent(ArrayList<Student> list){
        ArrayList<Student> newS = new ArrayList<Student>();
        for(Student student : list){
            if(student.getRank() == "A" || student.getRank() == "Passed"){
                newS.add(student);
            }
        }
        return newS;
    }
    public static void printStudent(ArrayList<Student> list){
        for(Student s : list){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<Student>();
        s.add(new ITStudent(51003001,"Nguyen Van A", 4.5));
        s.add(new ITStudent(51003002,"Nguyen Van B", 6.5));
        s.add(new ITStudent(51003003,"Nguyen Van C", 8.5));

        s.add(new MathStudent("M400101", "Tran Van D", 3.8));
        s.add(new MathStudent("M400102", "Tran Van E", 6.8));
        s.add(new MathStudent("M400103", "Tran Van F", 8.8));
        printStudent(s);
        System.out.println();

        ArrayList<Student> students = findStudent(s);
        printStudent(students);
    }
}
