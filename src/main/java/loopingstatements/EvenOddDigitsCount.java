package loopingstatements;

public class EvenOddDigitsCount {
    public static void main (String [] args){
        int num= 963266814;
        int evenCount=0;
        int oddCount =0;
        while(num>0){
            int digit = num%10;
            if(digit%2==0){
                System.out.println(+digit);
                evenCount++;

            }else{
                System.out.println(+digit);
                oddCount++;
            }
            num=num/10;
        }
        System.out.println("The number of even digits: " +evenCount);
        System.out.println("The number of odd digits: " +oddCount);

    }
}
