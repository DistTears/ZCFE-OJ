import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-11
 * Time: 23:01
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];//雷区
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        find(array);//去给每个位置找雷，并打印出来
    }

    /*
3 4
0 1 0 0
1 0 1 0
0 0 1 0

2 9 2 1
9 4 9 2
1 3 9 2
    * */
    private static void find(int[][] array) {
        int[][] a = new int[array.length][array[0].length];//扫雷的雷区
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 1) {
                    a[i][j] = 9;
                } else {
                    //检查四周的八个元素
                    int count = 0;
                    for (int x = i - 1; x <= i + 1; x++) {
                        for (int y = j - 1; y <= j + 1; y++) {
                            if (x >= 0 && x < array.length && y >= 0 && y < array[0].length) {
                                if (!(x == i && y == j) && array[x][y] == 1) {
                                    count++;
                                }
                            }
                        }
                    }
                    a[i][j] = count;
                }
            }
        }
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
