import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-05
 * Time: 21:06
 */

public class Main {
    public static void main(String[] args) {
        //输入流
        Scanner scanner = new Scanner(System.in);
        //输入食物的位置,正整数
        int food = Math.abs(scanner.nextInt());
        //定义走的次数
        int feet = 0;
        //循环使用1 2 3以最少此处组成food
        while (food != 0) {
            if (food >= 3) {
                int n = food / 3;
                food %= 3;
                feet += n;
            } else if (food >= 2) {
                int n = food / 2;
                food %= 2;
                feet += n;
            } else {
                food--;
                feet++;
            }
        }
        System.out.println(feet);
    }
}
