import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-01
 * Time: 16:26
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        int[] arr = new int[s1.length() + s2.length()];
        int i = 0;
        for (; i < s1.length(); i++) {
            arr[i] = Integer.parseInt(Character.toString(s1.charAt(i)));
        }
        for (int j = 0; j < s2.length(); i++, j++) {
            arr[i] = Integer.parseInt(Character.toString(s2.charAt(j)));
        }
        Arrays.sort(arr);
        StringBuilder s = new StringBuilder();
        for (int i1 : arr) {
            s.append(i1);
        }
        System.out.println(s);
    }
}
