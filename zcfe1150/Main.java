import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-01
 * Time: 13:18
 */

public class Main {
    public static int fun(int n) {
        StringBuilder s = new StringBuilder(Integer.toString(n));
        s.reverse();
        return Integer.parseInt(s.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; ; i++) {
            if (Math.abs(i - fun(i)) >= 100000 && Math.abs(i - fun(i)) <= 200000) {
                System.out.println(i);
                return;
            }
        }
    }
}
