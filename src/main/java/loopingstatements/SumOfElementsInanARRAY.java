package loopingstatements;

public class SumOfElementsInanARRAY {
    public static void main (String[] args){
        int a[]= {10,1,30,40,50};
        int sum =0;
  //      for (int i=0; i<a.length;i++) {
//            if(a[i]%2==0){
//                System.out.println(a[i]);
//            } else  {
//                System.out.println("The odd number is : " +a[i]);
//            }
//            sum = sum+a[i];
//        }

            for (int value:a){
                //int value = 0;
                if(value%2==0){
                    System.out.print("Even number:" +value);
                }
            }


        }}

