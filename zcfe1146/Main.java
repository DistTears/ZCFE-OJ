import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-01
 * Time: 10:39
 */
//1 1 2 3 5 8
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long left = 1;
        long right = 1;
        long sum = 0;
        if (n == 1 || n == 2) {
            System.out.println(1);
            return;
        }
        for (long i = 3; i <= n; i++) {
            sum = left + right;
            left = right;
            right = sum;
        }
        System.out.println(sum);
    }
}
