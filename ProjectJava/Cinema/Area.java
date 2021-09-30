package ProjectJava.Cinema;

//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Area implements Istatus {
    static enum STATUS{
        EMPTY,LESS,NORMAL,MORE
    }
    String CurrentTime;
    String name;
    STATUS status;
    public Area(){
        CurrentTime = "";
        name ="";
        status = STATUS.EMPTY;
    }
    public Area(String name){
        this.name = name;
        CurrentTime = "";
        status = STATUS.EMPTY;
    }
    public Area(String CurrentTime,String name,STATUS status){
        this.CurrentTime = CurrentTime;
        this.name = name;
        this.status = status;
    }
    public String getCurrentTime(){
        return this.CurrentTime;
    }
    public void setCurrentTime(String CurrentTime){
        this.CurrentTime = CurrentTime;
    }
    public STATUS geStatus(){
        return this.status;
    }
    public void setStatus(STATUS status){
        autoCurrent();
        this.status = status;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void autoCurrent(){
        SimpleDateFormat format = new SimpleDateFormat("H:m:s dd:mm:yyyy");
        Date time = new Date();
        CurrentTime = format.format(time);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("0.Empty");
        System.out.println("1.Less");
        System.out.println("2.Normal");
        System.out.println("3.more");
        System.out.println("Choose:");
        int option = sc.nextInt();

        switch(option){
            case 0:
                setStatus(STATUS.EMPTY);
                break;
            case 1:
                setStatus(STATUS.LESS);
                break;
            case 2:
                setStatus(STATUS.NORMAL);
                break;
            case 3:
                setStatus(STATUS.MORE);
                break;
        }
    }
    @Override
    public void onStatus(){
        switch(status){
            case EMPTY:
                System.out.println(getName() + " dang rong!!");
                break;
            case LESS:
                System.out.println(getName() +" dang it khach!!");
                break;
            case NORMAL:    
                System.out.println(getName() +" dang co khach vua phuc vu!!");
                break;
            case MORE:
                System.out.println(getName() +" dong khach!!");
                break;
        }
    }
    
}
