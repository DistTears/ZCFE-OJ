import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-18
 * Time: 23:06
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//年数
        int[] arr = new int[n];//时间段的能量ai
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = arr[arr.length - 1];//最后剩余最少的能量就是最后的能量
        //从后向前遍历
        for (int i = arr.length - 2; i >= 0; i--) {
            sum += 1;
            while (sum < arr[i]) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
