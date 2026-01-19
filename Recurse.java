import java.util.Scanner;
public class Recurse{
    public static char first(String s) {
        return s.charAt(0);
    }
    public static String rest(String s) {
        return s.substring(1);
    }
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }
    public static int length(String s) {
        return s.length();
    }
    public static String reverseString (String s){
        if(s.length()<=1){
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
    public static boolean palindrome(String s){
        if(s.equals(reverseString(s))){
            return true;
        }
        return false;
    }
    public static void main (String [] args){
        Scanner in =new Scanner (System.in);
        String reply=in.nextLine();
        
        System.out.println(first(reply));
        System.out.println(rest(reply));
        System.out.println(middle(reply));
        System.out.println(length(reply));
        System.out.println(reverseString(reply));
        System.out.println(palindrome(reply));
    }
}