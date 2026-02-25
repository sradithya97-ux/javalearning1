package loopingstatements;

import java.util.Scanner;

public class WhileLoppDemo1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String password;
        while (true){
            System.out.println("Enter your password:" );
            password = sc.nextLine();
        if(password.equals("abcd")){
            System.out.println("Access granted");
            break;
        }else {
            System.out.println("Incorrect password");
        }
    }}
}
