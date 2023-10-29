import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-16
 * Time: 22:53
 */

public class Main {
    public static boolean f(long[] arr, long c) {
        for (long l : arr) {
            if (l == c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long x = scanner.nextLong();
        long[] array = new long[(int) n];
        long a = 0;
        long b = 0;
        long c = 0;
        for (long i = 0; i < n; i++) {
            array[(int) i] = scanner.nextLong();
        }
        for (int i = 0; i < n; i++) {
            a = array[i];
            for (int j = 0; j < n; j++) {
                b = array[j];
                c = (long) ((-a * (Math.pow(x, 2))) - b * x);
                if (f(array, c)) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
