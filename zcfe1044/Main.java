
/**
 *
 看下面的算式：
 □□ x □□ = □□ x □□□
 它表示：两个两位数相乘等于一个两位数乘以一个三位数。
 如果没有限定条件，这样的例子很多。
 但目前的限定是：这9个方块，表示1~9的9个数字，不包含0。
 该算式中1至9的每个数字出现且只出现一次！
 比如：
 46 x 79 = 23 x 158
 54 x 69 = 27 x 138
 54 x 93 = 27 x 186
 .....
 请编程，输出所有可能的情况！
 注意：
 左边的两个乘数交换算同一方案，不要重复输出！
 不同方案的输出顺序不重要
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List result = new ArrayList();//保存运算结果，若左边两个数字相乘的结果在list中包含，则不打印

    public static void main(String[] args) {
        String s = "123456789";
        char[] c = s.toCharArray();
        createStr(c, 0, s.length() - 1);
    }

    // 产生字符串
    private static void createStr(char[] c, int low, int high) {
        if (low == high) {
            jisuan(c);
            return;
        }
        for (int i = low; i <= high; i++) {
            char temp = c[low];
            c[low] = c[i];
            c[i] = temp;

            createStr(c, low + 1, high);

            temp = c[low];
            c[low] = c[i];
            c[i] = temp;

        }
    }
    //计算结果，对每一个串进项判断
    private static void jisuan(char[] c) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < c.length; i++) {
            sb.append(c[i]);
        }
        String s1 = sb.toString().substring(0, 2);
        String s2 = sb.toString().substring(2, 4);
        String s3 = sb.toString().substring(4, 6);
        String s4 = sb.toString().substring(6);

        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);
        int a3 = Integer.parseInt(s3);
        int a4 = Integer.parseInt(s4);
        if (a1 * a2 == a3 * a4) {
            if (!result.contains(a1 * a2)) {
                result.add(a1*a2);
                System.out.println(a1 + "*" + a2 + "=" + a3 + "*" + a4);
            }
        }

    }
}
/*运行结果：
        46*79=23*158
        54*69=27*138
        54*93=27*186
        58*67=29*134
        58*69=23*174
        58*73=29*146
        58*96=32*174
        63*74=18*259
        64*79=32*158
        73*96=12*584
        76*98=14*532
 */
   
   
  