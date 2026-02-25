package arraysExample;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //   int matrix[][]= new int[3][3];

        int matrix[][] = {{100, 200},
                {300, 400},
                {500, 600}};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        for (int i = 0; i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println( );
        }

    }
}
