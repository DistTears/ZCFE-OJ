import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-15
 * Time: 22:53
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//输入数字的个数
        int[] array = new int[n];//定义一个数组，存放输入的数字
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();//输入n个数字
        }
        System.out.println(lengthOfLIS(array));
    }

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j <= i - 1; j++) {
                if (nums[i] > nums[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }
}
