import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-05
 * Time: 21:32
 */
public class Main {
    public static long addLong(long a, long b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 2;
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        System.out.println(addLong(num1, num2));
    }
}
