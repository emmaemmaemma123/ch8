import java.util.Scanner;
public class power{
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return x*power(x, n - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Scanner in2=new Scanner(System.in);
        int x= in.nextInt();
        int n=in2.nextInt();
        System.out.println(power(x,n));
    }
}
