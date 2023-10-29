import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-24
 * Time: 23:42
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int money = 1;
        int sum = 0;
        for (int i = 1; i <= n; ) {
            for (int j = 1; j <= money; j++) {
                sum += money;
                i++;
            }
            money++;

        }
        System.out.println(sum);
    }
}
