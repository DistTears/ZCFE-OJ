import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-15
 * Time: 22:58
 */
public class Main {
    public static long fun(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return fun(n / 2);
        } else {
            return fun((n - 1) / 2) + fun(((n - 1) / 2) + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        for (long i : arr) {
            System.out.println(fun(i));
        }
    }
}
