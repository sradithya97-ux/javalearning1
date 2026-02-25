package arraysExample;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;
        System.out.println(a.length);
        int i;


       /* for(i=0; i<=a.length -1;i++){
            System.out.println(a[i]);
        }*/
        for (int num : a) {
            System.out.println(num);
        }
    }
}
