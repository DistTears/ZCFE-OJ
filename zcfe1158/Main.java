import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-01
 * Time: 16:19
 */

public class Main {
    public static boolean funS(int n) {
        int i = 0;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                break;
            }
        }
        if (i == n) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean funH(int n) {
        StringBuilder s = new StringBuilder(Integer.toString(n));
        String str = s.toString();
        s.reverse();
        return str.equals(s.toString());
    }

    public static boolean fun7(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum % 7 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (fun7(i) && funH(i) || fun7(i) && funS(i) || funS(i) && funH(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
