import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-10
 * Time: 14:34
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double f = scanner.nextDouble();

        System.out.format("%.5f", 5 * (f - 32) / 9);
    }
}
