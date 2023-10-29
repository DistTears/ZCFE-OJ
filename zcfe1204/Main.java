import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();
        }

        // 检查是否可以通过交换使得数组非降序
        boolean canSort = canSortArray(a, p);

        // 输出结果
        if (canSort) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean canSortArray(int[] a, int[] p) {
        for (int i = 0; i < p.length; i++) {
            int idx = p[i] - 1;
            while (idx < a.length - 1 && a[idx] > a[idx + 1]) {
                // 交换a[idx]和a[idx+1]
                int temp = a[idx];
                a[idx] = a[idx + 1];
                a[idx + 1] = temp;
                idx++;
            }
        }

        // 检查数组是否非降序
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return true;
            }
        }

        return false;
    }
}
