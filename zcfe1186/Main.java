import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-13
 * Time: 23:00
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//表示河的宽度
        int x = scanner.nextInt();//表示需要去学校的天数
        int[] arr = new int[n - 1];//河中石头的高度
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int left = 1;//最低跳跃
        int right = n;//最高跳跃
        while (true) {
            int mid = (left + right) >>> 1;//取中间的mid
            if (is(arr, mid, x)) {//如果这个跳跃可以满足上课次数，那么就缩小范围

            } else {//不能满足就扩大范围

            }
        }
    }

    private static boolean is(int[] arr, int mid, int x) {
        while(true){

        }
    }
}
