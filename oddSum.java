import java.util.Scanner;
public class oddSum{
    public static int sumOdd(int n){
        if(n==1){
            return 1;
        }
        int result=n+sumOdd(n-2);
        return result;
    }
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int reply = in.nextInt();
        System.out.println(sumOdd(reply));
    }
}