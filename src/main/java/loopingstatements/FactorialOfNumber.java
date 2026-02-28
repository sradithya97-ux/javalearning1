package loopingstatements;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int i =1;
        int fact =1;
        int num=5;
        do{
            fact = fact*i;
            i++;
        }while(i<=num);
        System.out.println("Factorial of 6 is :" +fact);
    }
}
