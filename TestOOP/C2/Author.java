package C2;

import java.util.ArrayList;
import java.util.Scanner;

class Author {
    private String name;
    private int age;
    private String butDanh;
    private int dayDay;
    private String homeTown;
    public Author(){}
    public Author(String name, int age, String butDanh, int dayDay, String hometown){
        this.name = name;
        this.age = age;
        this.butDanh = butDanh;
        this.dayDay = dayDay;
        this.homeTown = hometown;
    }
    public void inputInfor(ArrayList<Author> AuthorList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Author:");
        name = sc.nextLine();
        System.out.println("Enter age of Author:");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter but danhh of Author:");
        while(true){
            butDanh = sc.nextLine();
            boolean check = false; // cho nos sai
            for(int i=0; i< AuthorList.size(); i++){
                if(AuthorList.get(i).getButDanh().equalsIgnoreCase(butDanh)){ // equalsIgnoreCase la khong phan biet chu thuong hay hoa
                    check = true;
                }
            }
            if(check != false){ // !check cung dc
                System.err.println("Enter Butdanh again 'cause U entered similar ButDanh:");
            }
            else{
                break; //
            }
        }
        System.out.println("Enter birth day of Author:");
        dayDay = Integer.parseInt(sc.nextLine());
        System.out.println("Enter home town of Author:");
        homeTown = sc.nextLine();
    }
    public void Display(){
        System.out.println("Author[" + name + "," + age + "," + butDanh + "," + dayDay + "," + homeTown + "]");
    }
    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}
    public int getAge(){return this.age;}
    public void setAge(int age){this.age = age;}
    public String getButDanh(){return this.butDanh;}
    public void setButDanh(String butDanh){this.butDanh = butDanh;}
    public int getDayday(){return this.dayDay;}
    public void setDay(int dayDay){this.dayDay = dayDay;}
    public String getHomeTown(){return this.homeTown;}
    public void setHomeTown(String homeTown){this.homeTown = homeTown;}

}
