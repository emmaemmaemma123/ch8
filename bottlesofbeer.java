import java.util.Scanner;
public class bottlesofbeer{
    public static void displaylyrics(int n){
        if(n>0){
            System.out.println(n + " bottles of beer on the wall,");
            System.out.println(n + " bottles of beer,");
            System.out.println("ya’ take one down, ya’ pass it around,");
            System.out.println((n-1)+" bottles of beer on the wall.");
            displaylyrics(n-1);
            if(n==0){
                System.out.println("No bottles of beer on the wall,");
                System.out.println("no bottles of beer,");
                System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
                System.out.println("’cause there are no more bottles of beer on the wall!");
            }
        }
    }
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int reply=in.nextInt();
        displaylyrics(reply);
    }
}