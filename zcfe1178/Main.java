import java.util.Scanner;

public class Main {
    private static int[][] arr;
    private static long max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //三角形行数
        arr = new int[N][N];
        //录入数字三角形
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        dfs(0,0,0,0,arr[0][0]);
        System.out.println(max);
    }
    /**
     * @param left 记录往左下走的次数
     * @param right 记录往右下走的次数
     * @param sum 递归过程中累计路径和
     */
    private static void dfs(int i, int j,int left, int right, int sum) {
        if(i+1 == arr.length || j+1 == arr[i].length) {
            if(Math.abs(left - right) <= 1) { //向左下走的次数与向右下走的次数相差不能超过 1
                max = max > sum ? max : sum;
            }
            return;
        }
        dfs(i+1, j, left+1, right, sum+arr[i+1][j]); //左下
        dfs(i+1, j+1, left, right+1, sum+arr[i+1][j+1]); //右下
    }
}
