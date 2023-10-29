import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-16
 * Time: 18:53
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long max = Math.max(Math.max(a, b), c);
        long i = 1;
        long k = 0;
        while (true) {
            k = i * max;
            if (k % a == 0 && k % b == 0 && k % c == 0) {
                System.out.println(k);
                return;
            }
            i++;
        }
    }
}
