import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取数组长度
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // 读取数组元素
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 计算每个元素的最大配对值
        for (int i = 0; i < n; i++) {
            int maxPairSum = 0;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    maxPairSum = Math.max(maxPairSum, arr[i] + arr[j]);
                }
            }
            System.out.print(maxPairSum + " ");
        }

        scanner.close();
    }
}
