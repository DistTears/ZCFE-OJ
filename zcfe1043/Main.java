/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-09
 * Time: 15:06
 */
public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 123; i <= 987; i++) {
            for (int j = 123; j < 987 - i; j++) {
                int k = i + j;
                if (check(i, j, k)) {
                    //System.out.println(i + "+" + j + "=" + "k");
                    count++;

                }
            }
        }
        System.out.println(count);
    }

    public static boolean check(int a, int b, int c) {
        int[] ans = new int[10];
        ans[0] = 1;
        while (a != 0) {
            if (ans[a % 10] == 0) {
                ans[a % 10] = 1;
            } else {
                return false;
            }
            if (ans[b % 10] == 0) {
                ans[b % 10] = 1;
            } else {
                return false;
            }
            if (ans[c % 10] == 0) {
                ans[c % 10] = 1;
            } else {
                return false;
            }
            a /= 10;
            b /= 10;
            c /= 10;
        }
        return true;
    }
}
