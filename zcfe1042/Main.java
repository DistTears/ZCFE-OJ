/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-07
 * Time: 23:16
 */

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int i = 0;
        int j = 0;
        int[] s = new int[9];//存放1 - 9的数字
        for (a = 100; a < 333; a++) {
            b = 2 * a;
            c = 3 * a;        //让三个数成比例
            s[0] = a / 100;
            s[1] = a % 100 / 10;
            s[2] = a % 10;  //分离每一位数，并用数组接受
            s[3] = b / 100;
            s[4] = b % 100 / 10;
            s[5] = b % 10;
            s[6] = c / 100;
            s[7] = c % 100 / 10;
            s[8] = c % 10;

            for (i = 0; i < 8; i++) {
                for (j = i + 1; j < 9; j++)
                    if (s[i] == s[j] || s[i] == 0 || s[j] == 0) break;//判断元素是否相等
                if (j < 9) break;
            }
            if (i == 8 && j == 9)
                System.out.println(a + " " + b + " " + c);
        }
    }
}
