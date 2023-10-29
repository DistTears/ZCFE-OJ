import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-17
 * Time: 23:05
 */

public class Main {
    static long count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long[] arr = new long[(int) n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLong();
        }
        for (long l : arr) {
            count = 0;
            fun("", l);
            System.out.println(count);
        }

    }

    public static void fun(String s, long n) {
        if (n == 0) {
            if (is(s)) {
                // System.out.println(s);
                count++;
            }
            return;
        }
        fun(s + "A", n - 1);
        fun(s + "B", n - 1);
    }

    private static boolean is(String s) {
        int left = 0;
        while (left < s.length()) {
            if (s.charAt(left) == 'B') {
                if ((left == (s.length() - 1)) || s.charAt(left + 1) != 'B') {
                    return false;
                } else {
                    left++;
                }
            }
            left++;
        }
        return true;
    }
}
