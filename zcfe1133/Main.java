import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-30
 * Time: 22:42
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder num = new StringBuilder("1");
        if (n >= 2) {
            num.append("0");
            for (int i = 2; i < n; i++) {
                num.append(i);
            }
        }
        System.out.println(num.toString());
    }
}
