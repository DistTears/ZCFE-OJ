import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-14
 * Time: 23:01
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//数字的个数
        int[] array = new int[n];//数组的个数
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();//循环输入数组
        }
        Arrays.sort(array);//升序排列数组
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                continue;
            }
            System.out.print(array[i] + " ");
        }
    }
}
