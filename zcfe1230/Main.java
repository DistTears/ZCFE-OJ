import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-25
 * Time: 23:57
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int r = scanner.nextInt();
        int whirt = 20000;
        double j = (r * r * 3.14) * h;
        System.out.println((int) Math.ceil(whirt / j));
    }
}
