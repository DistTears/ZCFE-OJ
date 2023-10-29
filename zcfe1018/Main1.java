/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-15
 * Time: 19:21
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxBoards = scanner.nextInt();
        int totalStalls = scanner.nextInt();
        int totalCows = scanner.nextInt();
        int[] cowStalls = new int[totalCows];

        for (int i = 0; i < totalCows; i++) {
            cowStalls[i] = scanner.nextInt();
        }

        Arrays.sort(cowStalls); // 将牛所在的牛棚编号排序

        // 使用二分查找确定所需木板的最小总长度
        int left = 1;
        int right = totalStalls;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isValid(mid, maxBoards, cowStalls)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }

    // 检查是否满足给定的木板数量
    private static boolean isValid(int target, int maxBoards, int[] cowStalls) {
        int boardsUsed = 1;
        int lastStall = cowStalls[0];

        for (int i = 1; i < cowStalls.length; i++) {
            if (cowStalls[i] - lastStall >= target) {
                boardsUsed++;
                lastStall = cowStalls[i];
            }
        }

        return boardsUsed >= maxBoards;
    }
}

