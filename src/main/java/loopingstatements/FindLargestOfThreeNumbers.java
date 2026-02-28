package loopingstatements;

import java.util.Scanner;

public class FindLargestOfThreeNumbers {
    public static void main (String[] args){

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a =sc.nextInt();

        System.out.println("Enter the first number: ");
        int b =sc.nextInt();

        System.out.println("Enter the first number: ");
        int c =sc.nextInt();

        if(a>b && a>c){
            System.out.println("A is the largest number");
        } else if (b>a && b>c) {
            System.out.println("B is the largest number");

        }else
            System.out.println("C is largest");
        {

        }
    }

}
