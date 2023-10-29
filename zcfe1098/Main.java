/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-25
 * Time: 13:31
 */

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 1000; i++) {
            sum = 0;
            sum += (Math.pow(Integer.toString(i).charAt(0) - '0', 3) +
                    Math.pow(Integer.toString(i).charAt(1) - '0', 3) +
                    Math.pow(Integer.toString(i).charAt(2) - '0', 3));
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
