package loopingstatements;

public class DuplicateElementsinArray {
    public static void main (String[] args){
        int arr[]= {1,2,5,8,2,9,6,5};

        for (int i =0; i<arr.length;i++){
            for (int j =i+1; j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("The duplicate number is: " +arr[i]);
                }
            }
        }
    }
}
