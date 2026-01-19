import java.util.Scanner;
public class Ackermann {
    public static int ack(int m, int n) {
        if (m == 0) {
            return n+ 1;
        }

        if (n==0) {
            return ack(m-1, 1);
        }
        return ack(m - 1, ack(m, n - 1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Scanner in2=new Scanner(System.in);
        int m= in.nextInt();
        int n=in2.nextInt();
        System.out.println(ack(m,n));
    }
}