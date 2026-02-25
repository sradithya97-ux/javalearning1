package arraysExample;

public class MaxValueArray {
    public static void main (String[] args){
        int numbers[]= {10,20,30,60,12};
        int max = numbers[0];

        for (int num: numbers){
            if (num>max){
                max=num;

            }
        }
        System.out.println(max);

    }
}
