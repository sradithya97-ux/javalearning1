package conditionalstatement;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args){
        //int day=3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Day is monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");break;
            case 4:
                System.out.println("Day is Thursday");break;
            case 5:
                System.out.println("Day is friday");break;
            case 6:
                System.out.println("Day is Sat");break;
            case 7:
                System.out.println("Day is sunday");break;
            default:
                System.out.println("invalid day");
        }
    }
}
