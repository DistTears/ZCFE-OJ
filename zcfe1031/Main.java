import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-05
 * Time: 17:59
 */
/*
*请统计某个给定范围[L, R]的所有整数中，数字2出现的次数。
比如给定范围[2, 22]，数字2在数2中出现了1次，在数12中出现1次，在数20中出现1次，在数21中出现1次，在数22中出现2次，所以数字2在该范围内一共出现了6次。
* */
public class Main {
    public static int findTwo(int num) {
        int count = 0;
        char[] chars = Integer.toString(num).toCharArray();
        for (char aChar : chars) {
            if (aChar == '2') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        int count = 0;
        for (int i = left; i <= right; i++) {
            count += findTwo(i);
        }
        System.out.println(count);
    }
}
