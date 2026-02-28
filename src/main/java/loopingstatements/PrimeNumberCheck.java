package loopingstatements;

public class PrimeNumberCheck {
    public static void main (String[] args){
        int num =5;
        if (num<=1){
            System.out.println("Not a prime number");
        }else{
            for (int i= 2; i<num/2; i++){
                if(num%i==0){
                    System.out.println(+ num +"This is not a prime number");
                    return;
                }
            }
            System.out.println("Prime number");
        }

    }
}
