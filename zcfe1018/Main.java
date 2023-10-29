/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-15
 * Time: 19:05
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();  // 木板最大的数目
        int S = scanner.nextInt();  // 牛棚的总数
        int C = scanner.nextInt();  // 牛的总数

        int[] cowStalls = new int[C];
        for (int i = 0; i < C; i++) {
            cowStalls[i] = scanner.nextInt();
        }

        Arrays.sort(cowStalls);  // 将牛所在的牛棚编号排序

        int low = 1;  // 最小木板长度的下界
        int high = cowStalls[C - 1];  // 最大木板长度的上界，即最后一个有牛的牛棚编号

        while (low < high) {
            int mid = (low + high + 1) / 2;
            if (isValid(cowStalls, mid, M)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(25);
    }

    // 判断是否能够用木板长度为length拦住所有有牛的牛棚
    private static boolean isValid(int[] cowStalls, int length, int M) {
        int count = 1;  // 初始木板数为1
        int lastStall = cowStalls[0];

        for (int i = 1; i < cowStalls.length; i++) {
            if (cowStalls[i] - lastStall >= length) {
                count++;
                lastStall = cowStalls[i];
            }
        }

        return count >= M;
    }
}
