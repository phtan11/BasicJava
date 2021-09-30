package TEst;
interface Age{
    void getAge();
}
class Anonymous{
    public static void main(String[] args){
        Age oj1 = new Age(){
            int x;
            @Override
            public void getAge(){
                x= 21;
                System.out.println("Age = " + x );
            }
        };
    oj1.getAge();
    }
}