package conditionalstatement;

public class IfElseIfLadder_Demo {

    public static void main(String[] args){
        int marks=80;
        if(marks>80){
            System.out.println("Your grade is A");
        } else if (marks>=90) {
            System.out.println("Your grade is A+");

        } else if (marks<=40) {
            System.out.println("You are passed");

        }else {
            System.out.println("You are failed");
        }
    }

}
