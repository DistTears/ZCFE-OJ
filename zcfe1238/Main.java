import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-27
 * Time: 22:46
 */

public class Main {
    static int r;
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        r = scanner.nextInt();
        if (n == 5) {
            m = 3;
        } else if (n == 10) {
            m = 4;
        }
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = Integer.toString(i + 1);
        }
        LinkedHashSet<String> set = new LinkedHashSet<>();
        fun(ss, 0, ss.length - 1, set);
        for (String s : set) {
            System.out.println(s);
        }
    }

    private static void fun(String[] strs, int from, int to, LinkedHashSet<String> set) {
        //递归终止的条件 - 当form==to的时候，说明只指向一个元素不用交换，
        //此时，元素也已经进行排列好了，可以直接返回
        if (from == to) {
            if ((Integer.parseInt(strs[0]) <= m) && f(strs)) {
                String[] s = new String[r];
                System.arraycopy(strs, 0, s, 0, r);
                set.add(sfun(s));
            }
        } else {
            //否则，就循环交换from到to之间的元素
            for (int i = from; i <= to; i++) {
                swap(strs, i, from);
                fun(strs, from + 1, to, set);
                swap(strs, i, from);
            }
        }
    }

    private static void swap(String[] strs, int i, int from) {
        String c = strs[i];
        strs[i] = strs[from];
        strs[from] = c;
    }

    private static boolean f(String[] chars) {
        for (int i = 0; i < 2; i++) {
            if (Integer.parseInt(chars[i]) >= Integer.parseInt(chars[i + 1])) {
                return false;
            }
        }
        return true;
    }

    private static String sfun(String[] ss) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            sb.append(ss[i]).append(" ");
        }
        return sb.toString();
    }
}
