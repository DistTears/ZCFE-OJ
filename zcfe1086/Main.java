import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-22
 * Time: 22:48
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        for (int i = 0; i < s2.length(); i++) {
            if (s1.contains(s2.charAt(i) + "")) {
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
    }
}
