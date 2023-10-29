import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-20
 * Time: 23:08
 */
/*
4
1 3 2 2
-------------
6
* */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//数列的个数
        int[] arr = new int[n];//数列
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;//窗口里的和
        int acc = 1;//窗口里的积
        int count = 0;
        for (int left = 0; left < n; left++) {

            for (int right = 0; right < n; right++) {
                sum = 0;
                acc = 1;
                if (left == right) {
                    sum += arr[left];
                    acc *= arr[left];
                } else {
                    for (int i = left; i <= right; i++) {
                        sum += arr[i];
                        acc *= arr[i];
                    }
                }
                if (sum == acc) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
