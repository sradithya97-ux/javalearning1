package constructordemo;

public class Constructor_Demo1 {
    //Default constructor
    Constructor_Demo1(){
        int a=20;
        String str="Adithya";
        System.out.println(str);
    }

    //Parameterised constructor
    Constructor_Demo1(String st, int n){
         String name=st;
         int age=n;
        System.out.println(st);
    }

    //Copy constructor
    public static void main(String [] args){
        Constructor_Demo1 cd1= new Constructor_Demo1();
        Constructor_Demo1 cd2= new Constructor_Demo1("John",5);

    }
}
