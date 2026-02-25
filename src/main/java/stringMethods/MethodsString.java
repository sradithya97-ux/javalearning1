package stringMethods;

public class MethodsString {

    public static void main (String[] args){
        String s= "    welcome   ";
        System.out.println("Length od the string is :" +s.length());
        String j= s.trim();
        System.out.println("trim:" +j);
        System.out.println("Length after trim is : "+ j.length());
    }
}
