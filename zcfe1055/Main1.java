/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-18
 * Time: 0:03
 */

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // 测试数据组数
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // 椅子数量
            arr[i] = n;
        }
        for (int m : arr) {
            long[] dp = new long[m + 1];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= m; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            System.out.println(dp[m]);
        }
    }
}

