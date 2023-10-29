import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-01
 * Time: 10:49
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double hegit = 50;//反弹的高度
        double sum = 100;//一共走的路程
        for (int i = 2; i <= n; i++) {
            sum += hegit * 2;
            hegit = hegit / 2;
        }
        System.out.println(sum);
        System.out.println(hegit);
    }
}
