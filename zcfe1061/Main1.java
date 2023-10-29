import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-16
 * Time: 22:50
 */

public class Main1 {
    // 求两个数的最大公约数
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 求三个数的最小公倍数
    private static long lcm(long a, long b, long c) {
        long gcdAB = gcd(a, b);
        long gcdABC = gcd(gcdAB, c);
        return (a * b * c) / gcdABC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long result = lcm(a, b, c);
        System.out.println(result);
    }
}
