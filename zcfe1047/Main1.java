/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-17
 * Time: 18:10
 */
public class Main1 {
    // 把12个格子放入数组
    static int arr[] = new int[12];

    // 数组标记,0为无，1为有
    static int flag[] = new int[12];

    // 放存每条直线的和
    static int sum[] = new int[6];

    public static void main(String[] args) {
//将已知的三个数赋值, 并且将这三个数进行标记,arr[5]为所求的数
        flag[0] = 1;
        arr[0] = 1;
        flag[7] = 1;
        arr[1] = 8;
        flag[2] = 1;
        arr[11] = 3;
        fun(0);
    }

    public static void fun(int x) {
// 这个3个数为已知，直接跳过
        if (x == 0 || x == 1 || x == 11) {
            fun(x + 1);
            return;
        }

// 格子放满，进行判断
        if (x > 11) {
// 每条线上的和
            sum[0] = arr[0] + arr[2] + arr[5] + arr[7];
            sum[1] = arr[0] + arr[3] + arr[6] + arr[10];
            sum[2] = arr[7] + arr[8] + arr[9] + arr[10];
            sum[3] = arr[1] + arr[5] + arr[8] + arr[11];
            sum[4] = arr[4] + arr[6] + arr[9] + arr[11];
            sum[5] = arr[1] + arr[2] + arr[3] + arr[4];

// 若每条线上的和相等
            if (sum[0] == sum[1] && sum[1] == sum[2] && sum[2] == sum[3] && sum[3] == sum[4] && sum[4] == sum[5] && sum[5] == sum[0])
                System.out.println(arr[5]);
            return;
        }

// 为格子赋值
        for (int i = 0; i < arr.length; i++) {
            if (flag[i] == 0) {
                flag[i] = 1;
                arr[x] = i + 1;
                fun(x + 1);
                flag[i] = 0;
            }
        }
    }
}

