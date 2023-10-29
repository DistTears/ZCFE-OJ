
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-17
 * Time: 18:00
 */
/*
 * 全排列+判断的写法
 * */
public class Main {
    static int ans;
    static int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public static void main(String[] args) {
        f(0);
        System.out.println(ans);
    }

    private static void f(int k) {
        if (k == 12) {
            check();
        }
        for (int i = k; i < a.length; i++) {
            int t = a[i];
            a[i] = a[k];
            a[k] = t;
            f(k + 1);
            t = a[i];
            a[i] = a[k];
            a[k] = t;
        }
    }

    /**
     * 0 2 5 7
     * 0 3 6 10
     * 7 8 9 10
     * 1 2 3 4
     * 1 5 8 11
     * 4 6 9 11
     *
     * @param arr
     */
    private static void check() {
        if (a[0] != 1 || a[1] != 8 || a[11] != 3) return;
        int num1 = a[0] + a[2] + a[5] + a[7];
        int num2 = a[0] + a[3] + a[6] + a[10];
        if (num1 != num2) return;
        int num3 = a[7] + a[8] + a[9] + a[10];
        if (num1 != num3) return;
        int num4 = a[1] + a[2] + a[3] + a[4];
        if (num1 != num4) return;
        int num5 = a[1] + a[5] + a[8] + a[11];
        if (num1 != num5) return;
        int num6 = a[4] + a[6] + a[9] + a[11];
        if (num1 != num6) return;
        ans = a[5];
    }
}

