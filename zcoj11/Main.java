import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-10
 * Time: 14:31
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double pi = 3.14159;
        System.out.format("%.4f ", 2 * r);
        System.out.format("%.4f ", 2 * r * pi);
        System.out.format("%.4f ", r  * r * pi);
    }
}
