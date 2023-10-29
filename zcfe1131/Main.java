import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-30
 * Time: 22:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int x = 0;//固定值x
        int n = 0;//左边界
        int m = 0;//右边界
        while (true) {
            x = scanner.nextInt();
            n = scanner.nextInt();
            m = scanner.nextInt();
            for (int i = n; i <= m; i++) {
                int count = Integer.toString(i).length();//位数
                if (fun(i, count, x)) {
                    System.out.println(i);
                }
            }
            System.out.println();
        }
    }

    public static boolean fun(int num, int count, int x) {
        String n = Integer.toString(num);
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Math.pow(Integer.parseInt(Character.toString(n.charAt(i))), count);
        }
        if (sum * x == num) {
            return true;
        } else {
            return false;
        }
    }
}
