import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-24
 * Time: 22:14
 */
/*
10 20 99
----------
8
* */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;
        int day = 0;
        while (sum < n) {
            for (int i = 1; i <= 5; i++) {
                sum += a;
                day++;
                if (sum >= n) {
                    break;
                }
            }
            if (sum >= n) {
                break;
            }
            for (int i = 1; i <= 2; i++) {
                sum += b;
                day++;
                if (sum >= n) {
                    break;
                }
            }
            if (sum >= n) {
                break;
            }
        }
        System.out.println(day);
    }
}
