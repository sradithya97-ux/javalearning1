package loopingstatements;

public class PalindromeString {
    public static void main (String[] args){

        String str = "MADAM";
        String strnew= str;
        String rev ="";
        int length = str.length();
        for(int i = length-1 ;i >=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println("The reversed character is :" +rev);

        if (rev.equals(strnew)){
            System.out.println("The word is Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }



    }
}
