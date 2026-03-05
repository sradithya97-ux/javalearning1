package oopsconept;



public class Constructor_Overloading_Demo1 {
    String name;
    int age;
    //Default constructor
    Constructor_Overloading_Demo1(){
        name = "Unknown";
         age=20;
    }

    //Constructor with sing parameter
    Constructor_Overloading_Demo1(String n){
         name=n;
         age=0;

    }

    //Constructor with 2 arguments
    Constructor_Overloading_Demo1(String n, int a) {
         name = n;
         age = a;
    }

       void display() {

           System.out.println(" Name:" +name + " age : " +age);
        }

        public static void main (String[] args){
        Constructor_Overloading_Demo1 s1= new Constructor_Overloading_Demo1();
        Constructor_Overloading_Demo1 s2= new Constructor_Overloading_Demo1("Adithya");
        Constructor_Overloading_Demo1 s3= new Constructor_Overloading_Demo1("John", 14);

        s1.display();
        s2.display();
        s3.display();


        }

    }

