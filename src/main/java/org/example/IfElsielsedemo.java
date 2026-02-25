package org.example;

public class IfElsielsedemo {
    public static void main(String[] args){
        int mark=1;
        if (mark>=80){
            System.out.println("The grade is A+");
        } else if (mark>=75) {
            System.out.println("The grade is a");
        } else if (mark>=50) {
            System.out.println("Passed");

        }else {
            System.out.println("failed");
        }
    }
}
