package java.Basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt"); 
        Scanner sc =  new Scanner(file);
        if(sc.hasNextLine()) {
            String w = sc.nextLine();
            System.out.println(w);
        }
    }
}
