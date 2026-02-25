package org.example;

public class Ternary_Operator {
    public static void main(String[] args) {
       /* int a=120 , b=200;
        int x= (a>b)? a:b;
        System.out.println("The greatest value is :" +x);*/

        //Basic number check
       /* int num =10;
        String s = (num%2 ==0 ) ? "Even" : "odd";
        System.out.println("The number is : " +s);*/

        //Greatest mark
        int mark = 5;
        String grade = mark >= 75 ? "A+" :
                mark >= 65 ? "A" :
                        mark > 45 ? " pass" : "Fail";
        System.out.println("The grade is :" +grade);


    }
}
