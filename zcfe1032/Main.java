import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-05
 * Time: 18:28
 */

public class Main {
    /*
     * 判断回文串的方法
     * */
    public static boolean isPanNum(String str) {
        if (str.length() == 1) {
            return false;
        }
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /*
     * 滑动窗口找回文子串
     * */
    public static int windowStr(String str) {
        int len = 101;
        int left = 0;
        while (left < str.length()) {
            int right = str.length();
            while (left < right) {
                String sonStr = str.substring(left, right);
                if (isPanNum(sonStr)) {
                    len = (Math.min(sonStr.length(), len));
                    right--;
                } else {
                    right--;
                }
            }
            left++;
        }
        return len == 101 ? -1 : len;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = windowStr(str);
        System.out.println(len);
    }
}
