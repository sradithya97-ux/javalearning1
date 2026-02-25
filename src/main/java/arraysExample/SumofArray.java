package arraysExample;

public class SumofArray {
    public static void main (String[] args){
        int marks[]= {100,200,300,400,500};
        int sum =0;
        for(int i =0; i<marks.length;i++){
            sum=sum+marks[i];


        }
        System.out.println( "The sum of the marks are : " +sum);
    }
}
