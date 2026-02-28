package loopingstatements;

public class ReverseNumber {
    public static void main(String[] args) {

        int num=12345;
        int rev=0;
        while (num!=0){
            int digit= num%10;//Removes the last digit
            rev= rev*10+digit;//Reverse happended
            num= num/10;
        }
        System.out.println(rev);

    }
}
