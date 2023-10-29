import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-26
 * Time: 23:15
 */
public class Main {
    //公式为：C(n, k) = n! / (k! * (n - k)!)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> list1 = new ArrayList<>();
        while (true) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            if (n == -1 && k == -1) {
                break;
            }
            scanner.nextLine();
            long count = 0;

            for (long i = 1; i <= n; i++) {
                String s = scanner.nextLine().replace(".", "");
                count += s.length();
            }
            list1.add(fun(count, k));

        }
        for (Long l : list1) {
            System.out.println(l);
        }
    }

    public static long fun(long n, long k) {
        return f(n) / (f(k) * f(n - k));
    }

    public static long f(long n) {
        long j = 1;
        for (long i = 1; i <= n; i++) {
            j *= i;
        }
        return j;
    }
}
