import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-22
 * Time: 22:50
 */
/*
ABCDEABCD
XAABZ
--------------
3
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int left = 0;
        int min = Integer.MAX_VALUE;//最小改动的字符
        int right = t.length() - 1;
        while (right < s.length()) {
            min = Math.min((fun(s.substring(left, right + 1), t)), min);//寻找该滑动窗口里的字符串和模式串有多少不同的字符)
            right++;
            left++;
        }
        System.out.println(min);
    }

    private static int fun(String s, String t) {
        int count = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
