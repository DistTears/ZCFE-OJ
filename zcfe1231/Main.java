import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-26
 * Time: 22:41
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        double sn = 0;
        double i = 0;
        while (sn <= k) {
            i++;
            sn += 1 / i;

        }
        System.out.println((int) i);
    }
}
