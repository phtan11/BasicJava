package VIIHomeWorkBai2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Scanner;
public class EngViet { // khoang 10 tu va per word has two attrobutes include word and meaning
    public static Boolean checkAW(HashMap<String,String> list,String x){
        HashMap<String,String> newJ = new HashMap<String,String>();
        Dictionary<Integer,String> dic = new Hashtable<Integer,String>();
        dic.put(1,"hello");
        dic.put(2,"what");
        dic.put(3,"stupid");
        dic.put(4,"where");
        dic.put(5,"can");
        dic.put(6,"uneducated");
        dic.put(7,"Mad");
        dic.put(8,"who");
        Enumeration<String> e = dic.elements();
        while(e.hasMoreElements()){
            for(String i: list.keySet()){
                if(i != e.nextElement()){
                   return false;
                }
            }
        }
        return  true;
    }
    // public static String meanings(String wordd){
        
    // }
    public static void print(HashMap<String,String> list){
        for(String i: list.keySet()){
            System.out.println(i + "," + list.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        HashMap<String,String> s = new HashMap<String,String>();
        s.put("hello","xin chao");
        s.put("stupid","ngu ngoc");
        s.put("what","cai gi");
        s.put("where","o dau");
        s.put("who","ai");
        s.put("can","co the");
        s.put("happy","vui");
        s.put("Mad","dien");
        s.put("funny","vui tinh");
        s.put("uneducated","mat day");
        //print(s);
        if(checkAW(s,word) == true){
            System.out.println("1.word in Dictionary!!");
        }
        else{
            System.out.println("1.word not in Dictionary!!");
        }
    } // toi ktra co trong tu dien hay k
    // nhap 1 tu roi dich ra nghia
}
