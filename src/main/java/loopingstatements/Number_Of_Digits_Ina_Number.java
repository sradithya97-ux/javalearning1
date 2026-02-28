package loopingstatements;

public class Number_Of_Digits_Ina_Number {
    public static void main (String[] args){
        int num =669874569;
        int count=0;
        while(num!=0){
            num= num/10;
            count++;
        }
        System.out.println(+count);
    }
}
