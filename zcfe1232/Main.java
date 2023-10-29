import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-26
 * Time: 22:47
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        int height = scanner.nextInt() + 30;
        int count = 0;
        for (int i : arr) {
            if (i <= height) {
                count++;
            }
        }
        System.out.println(count);
    }
}
