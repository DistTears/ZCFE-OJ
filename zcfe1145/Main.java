import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-01
 * Time: 10:31
 */
public class Main {
    public static int fun(int n, int m) {
        if (m == 0 || n == m) {
            return 1;
        } else {
            return fun(n - 1, m - 1) + fun(n - 1, m);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(fun(i, j) + " ");
            }
            System.out.println();
        }
    }
}
