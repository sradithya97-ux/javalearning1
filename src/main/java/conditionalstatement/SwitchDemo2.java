package conditionalstatement;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char vowel= sc.next().charAt(0);

        switch (vowel){
            case 'a':
                System.out.println("A is a vowel");break;
            case 'e':
                System.out.println("E is avowel");break;
            case 'i':
                System.out.println("I is a vowel");break;
            case 'o':
                System.out.println("O is a vowel");break;
            case 'u':
                System.out.println("U is avowel");break;

            default:
                System.out.println("Not a vowel");
        }


    }
}
