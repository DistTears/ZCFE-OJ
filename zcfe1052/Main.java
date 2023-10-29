import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-10
 * Time: 18:30
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        if (num < 0) {
            System.out.println(false);
        } else {
            String str = Long.toString(num);
            int left = 0;
            int right = str.length() - 1;
            while (left <= right) {
                if (str.charAt(left) == str.charAt(right)) {
                    left++;
                    right--;
                } else {
                    System.out.println(false);
                    return;
                }
            }
            System.out.println(true);
        }
    }
}
