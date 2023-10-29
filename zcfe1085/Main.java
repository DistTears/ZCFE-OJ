import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-22
 * Time: 13:52
 */
public class Main {//      9 11

    //abcdaacbbaaa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        String str = scanner.nextLine();//输入字符串
        int max = 0;//最长的好串
        int left = 0;//左指针
        int start = 0;//记录最长好串的开始位置
        int count = 0;
        int right = 0;
        while (left < str.length()) {
            count = 0;
            start = left;
            for (right = left; right < str.length(); right++) {
                if (str.charAt(left) == str.charAt(right)) {
                    count++;
                } else {
                    break;
                }

            }
            max = Math.max(max, count);
            left = right;
        }
        System.out.println(str.substring(start, start + count));

    }
}
