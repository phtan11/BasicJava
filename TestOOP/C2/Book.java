package C2;

import java.util.Scanner;

class Book {
    private String BookName;
    private int DayProduce;
    private String ButDanhofBook;
    public Book(){
        
    }
    public Book(String BookName,int DayProduce,String ButDanhofBook){
        this.setBookName(BookName);
        this.setDayProduce(DayProduce);
        this.setButDanhofBook(ButDanhofBook);
    }
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book name:");
        BookName = sc.nextLine();
        System.out.println("Enter Day produce:");
        DayProduce = Integer.parseInt(sc.nextLine());
        System.out.println("Enter but danh cua book:");
        ButDanhofBook = sc.nextLine();
    }
    public void Display(){
        System.out.println("Book[book name =" + BookName + ",Day produce =" + DayProduce + ",But dAnh cua BOOK = "+ ButDanhofBook + "]");
    }
    public String getBookName() {
        return BookName;
    }
    public void setBookName(String bookName) {
        this.BookName = bookName;
    }
    public int getDayProduce() {
        return DayProduce;
    }

    public void setDayProduce(int dayProduce) {
        this.DayProduce = dayProduce;
    }
    public String getButDanhofBook() {
        return ButDanhofBook;
    }

    public void setButDanhofBook(String butDanhofBook) {
        this.ButDanhofBook = butDanhofBook;
    }
}
