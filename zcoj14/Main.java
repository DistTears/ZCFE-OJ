import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-10
 * Time: 14:43
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 初始整型变量的值
        if (n > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

