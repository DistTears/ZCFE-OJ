import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-15
 * Time: 23:30
 */

public class Main {
    /*
     * 打印前n行的杨辉三角
1
1 1
1 2 1
1 3 3 1
     * */
    public static void yanghui(int n) {
        int[][] array = new int[n][n];
        //行数
        for (int i = 0; i < n; i++) {
            //列数
            for (int j = 0; j <= i; j++) {
                if (j == 0 || (j == i)) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
        }
        //遍历二维数组
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        yanghui(scanner.nextInt());
    }

}
