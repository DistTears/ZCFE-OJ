/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-06
 * Time: 22:02
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

    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            if (isPanNum(Integer.toString(i))) {
                System.out.println(i);
            }
        }
    }
}
