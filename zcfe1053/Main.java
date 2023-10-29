import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-10
 * Time: 18:38
 */

public class Main {
    public static int fun(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fun(n / 2) + fun(n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long[] arr = new long[(int) num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLong();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(fun(arr[i]));
        }
    }
}
