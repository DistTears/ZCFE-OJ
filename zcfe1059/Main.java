import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-18
 * Time: 23:41
 */

public class Main {
    public static int findMax(int[] arr, int p) {
        int max = 0;//最大的糖果数
        for (int left = 0; left < arr.length - 1; left++) {//左指针
            for (int right = left + 1; right < arr.length; right++) {//右指针
                if ((arr[left] + arr[right]) / p >= 0) {
                    max = Math.max(max, (arr[left] + arr[right]) % p);
                } else {
                    max = Math.max(max, arr[left] + arr[right]);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int t = scanner.nextInt();//要测试的数据个数
        int n = 0;//糖果的堆数
        int p = 0;//一包糖果的数量
        int arr[] = new int[0];//n堆糖果的个数
        int[] result = new int[100];//保存每个数据的结果
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();//输入糖果的堆数
            p = scanner.nextInt();//输入一包糖果的数量
            arr = new int[n];
            for (int j = 0; j < arr.length; j++) {
                //输入n堆糖果的个数
                arr[j] = scanner.nextInt();
            }
            result[i] = findMax(arr, p);//计算最大糖果数，并放入数组
        }
        //最后打印数组即可
        for (int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }
    }
}
