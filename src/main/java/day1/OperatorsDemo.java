package day1;

public class OperatorsDemo {

    public static void main(String[] args){
        int a=30; int b=10;
        //Arithmetic operator
        System.out.println("a+b = " +(a+b));
        System.out.println("a-b = " +(a-b));
        System.out.println("a*b = " +(a*b));
        System.out.println("a/b = " +(a/b));
        System.out.println("a%b = " +(a%b));

        //Relational /comaprison operator
        System.out.println("a>b :" +(a>b));
        System.out.println("a!= b: " +(a!=b));
        System.out.println("a==b : " +(a==b));


        //logical operator
        boolean x= true;  boolean y= false;
        System.out.println("x&&y: " +(x&&y));
        System.out.println("x||y: " +(x||y));
        System.out.println("|x: " +(!x));
        System.out.println("|x: " +(!y));

        //Assignment operator
        int c=7;
        System.out.println("C+=3: " +(c+=3));
        System.out.println("c-=3: " +(c-=3));
        System.out.println("c/=3: "+(c/=3));
        System.out.println("c/=3: "+(c%=3));

        //Increment or decrement operator
        int d=10;
        System.out.println("d++: " +d++);
        System.out.println("++d: " +(++d));

        //Conditional statement
        int age=20;
        String entry= (age>=20 ? "Adult": "Minor");
        System.out.println(entry);
    }
}
