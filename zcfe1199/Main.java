import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-16
 * Time: 23:00
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        String s = "";
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            while (true) {
                if (s.contains(Integer.toString(arr[i]))) {
                    arr[i] = arr[i] + 1;
                } else {
                    s = s + arr[i];
                    break;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
