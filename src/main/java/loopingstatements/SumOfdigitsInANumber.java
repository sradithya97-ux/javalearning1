package loopingstatements;

public class SumOfdigitsInANumber {

    public static void main (String[] args){
        int num =98745612;
        int sum =0;
        while (num>0){
            sum= sum+num%10;
            num=num/10;
        }
        System.out.println("The sum of digits are: " +sum);
    }
}
