package loopingstatements;

public class CompareTwoArraysAreEqual {
    public static void main (String[] args ){
        int arr1[]= {10,20,30,40};
        int arr2[]= {10,20,3,40};

        if(arr1.length!= arr2.length){
            System.out.println("Arrays are not equal");
            return;
        }else {
            for(int i=0 ; i<arr1.length;i++){
                if(arr1[i]!= arr2[i]){
                    System.out.println("Arrays are not equal");
                    return;
                }
            }
            System.out.println("Arrays are eqaul");
        }
    }
}
