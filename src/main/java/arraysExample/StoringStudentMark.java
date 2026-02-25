package arraysExample;

public class StoringStudentMark {
    public static void main (String[] args){
        int marks[]= {100,200,300,400,500,600};
        System.out.println(" The first mark: " +marks[0]);
        System.out.println("Total marks are : " +marks.length);

       /* for (int i =0 ; i<marks.length ;i++){
            System.out.println("marks : " +marks[i]);
        }*/

        for (int mark:marks
             ) {
            System.out.println(mark);

        }
    }
}
