import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-19
 * Time: 21:44
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();
        int max = 0;//最大利润
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            //输入每天股票的价格
            arr[i] = scanner.nextLong();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1] - arr[0]);
    }
}
