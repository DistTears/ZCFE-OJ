import java.util.Scanner;

public class Main {
    public static int uniquePaths(int m, int n) {
        // 创建一个二维数组来存储不同路径的数量
        int[][] dp = new int[m][n];

        // 初始化第一列，只有一种路径到达，从起点向下
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // 初始化第一行，只有一种路径到达，从起点向右
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // 填充其余的格子，每个格子的路径数量等于左边格子和上面格子的路径数量之和
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // 最终右下角的格子存储了从起点到达终点的不同路径数量
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int result = uniquePaths(m, n);
        System.out.println(result);
    }
}
