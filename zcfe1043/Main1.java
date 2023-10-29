/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-08
 * Time: 22:53
 */

public class Main1 {
    public static void main(String[] args) {
        int ans = 0;
        for (int a = 123; a <= 987; a++) {
            for (int b = 123; b <= 987 - a; b++) {
                int c = a + b;
                if (check(a, b, c)) {
                    //System.out.println(a + "+" + b + "=" + c);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean check(int a, int b, int c) {//abc是否都不一样
        int[] flag = new int[10];//0 - 9
        flag[0] = 1;
        while (a != 0) {
            if (flag[a % 10] == 0) flag[a % 10] = 1;
            else return false;
            if (flag[b % 10] == 0) flag[b % 10] = 1;
            else return false;
            if (flag[c % 10] == 0) flag[c % 10] = 1;
            else return false;
            a /= 10;
            b /= 10;
            c /= 10;
        }
        return true;
    }
}
