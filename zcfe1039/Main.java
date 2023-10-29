import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-07
 * Time: 23:03
 */

public class Main {
    public static void main(String[] args) {
        //输入矩阵的行和列
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        //创建二维数组
        int[][] array = new int[n][m];
        //矩阵中所有元素的和
        int sum = 0;
        //循环输入二维数组的数据
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num = scanner.nextInt();
                sum += num;
                array[i][j] = num;
            }
        }
        //最后输出sum
        System.out.println(sum);
    }
}
