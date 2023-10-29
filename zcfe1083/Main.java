import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-21
 * Time: 23:00
 */

public class Main {
    public static void fun(String str, int n) {
        if (n == str.length()) {
            return;
        }
        fun(str, n + 1);
        System.out.print(str.charAt(n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        fun(s, 0);
    }
}
