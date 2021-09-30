package TEst;
class SingletonExample{
    private static SingletonExample singletonExample = null;
    private SingletonExample(){
    }
    public static SingletonExample getInstance(){
        if(singletonExample == null){
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }
    public void display(){
        System.out.println("Welcome to Singleton Design pattern");
    }
}
public class SingletonTest {
    public static void main(String[] args){
        SingletonExample singletonExample = SingletonExample.getInstance();
        singletonExample.display();
    }
}
