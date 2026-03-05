package oopsconept;

public class MethodOverloadingDemo1 {
     int print (int number){

        return number*number;
    }

    String print(String name){

         return name+" hello";



    }


    public static void main (String[] args){
        MethodOverloadingDemo1 m1= new MethodOverloadingDemo1();

        int a=m1.print(5);
        System.out.println(a);

        String s= m1.print("Hai");
        System.out.println(s);



    }

}
