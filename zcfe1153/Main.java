import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-01
 * Time: 14:07
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//n个用户
        int l = scanner.nextInt();//n个用户中连续的l个用户
        int sum = 0;//连续l个用户的奖励之和
        int x = scanner.nextInt();//x
        int y = scanner.nextInt();//y
        int z = scanner.nextInt();//z
        int max = 0;//奖励最大和
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            if (i % x == 0 && i % y == 0) {
                arr[i - 1] = 2;
            } else if (i % y == 0 && i % z == 0) {
                arr[i - 1] = 4;
            } else if (i % x == 0 && i % z == 0) {
                arr[i - 1] = 8;
            } else if (i % x == 0 && i % z == 0 && i % y == 0) {
                arr[i - 1] = 10;
            } else {
                arr[i - 1] = 1;
            }
        }
        int left = 0;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            if (right - left + 1 == l) {
                max = Math.max(sum, max);
                sum -= arr[left];
                left++;
            }
        }
        System.out.println(max);
    }
}
