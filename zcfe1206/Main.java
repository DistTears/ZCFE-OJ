import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-19
 * Time: 23:26
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println((int)Math.pow(b, p) % k);
    }
}
