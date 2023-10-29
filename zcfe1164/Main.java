import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入的N、M和K
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        // 读取每个产品的检测结果并存储在一个二维数组中
        int[][] products = new int[N][K];
        for (int i = 0; i < N; i++) {
            String result = scanner.next();
            for (int j = 0; j < K; j++) {
                products[i][j] = Character.getNumericValue(result.charAt(j));
            }
        }

        // 初始化最小优秀指标总项数为一个较大的值
        int minExcellentCount = Integer.MAX_VALUE;

        // 遍历所有可能的连续M件产品
        for (int i = 0; i <= N - M; i++) {
            int excellentCount = 0; // 用于记录当前连续M件产品的优秀指标总项数

            // 遍历当前连续M件产品的每个指标
            for (int j = i; j < i + M; j++) {
                for (int l = 0; l < K; l++) {
                    excellentCount += products[j][l];
                }
            }

            // 更新最小优秀指标总项数
            minExcellentCount = Math.min(minExcellentCount, excellentCount);
        }

        // 输出最小优秀指标总项数
        System.out.println(minExcellentCount);

        scanner.close();
    }
}
