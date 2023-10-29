import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-14
 * Time: 23:51
 */

public class Main {
    //cabcabca
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int left = 0;
        int min = 0;
        for (int right = 1; right < s.length(); right++) {
            String s2 = s.substring(left, right);
            if (right + s2.length() <= n && s.substring(right, right + s2.length()).equals(s2)) {
                min = s2.length();
                left++;
                right = right - 1;
            }
        }
        System.out.println(min);
    }
}
