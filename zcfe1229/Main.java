import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-25
 * Time: 23:49
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int t = scanner.nextInt();
        int s = scanner.nextInt();
        if (t == 0) {
            System.out.println(0);
            return;
        }
        if (m - ((int) Math.ceil(s / t)) <= 0) {
            System.out.println(0);
        } else {
            System.out.println(m - ((int) Math.ceil(s / t)));
        }

    }
}
