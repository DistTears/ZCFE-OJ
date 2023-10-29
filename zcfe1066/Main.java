import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-14
 * Time: 23:38
 */

public class Main {
   /* //1 1 2 3 5 8 13
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        if (n == 1 || n == 2) {
            System.out.println(1);
        }
        long n1 = 1;
        long n2 = 1;
        long n3 = n1 + n2;
        for (int i = 3; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(n3);
    }
}
