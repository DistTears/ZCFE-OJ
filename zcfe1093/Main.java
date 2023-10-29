import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-25
 * Time: 11:41
 */
/*
 *
 * *
 * * *
 * * * *
 * * * * *
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//直角边长
        for (int i = 1; i <= n; i++) {
            //先打印空格
            for (int j = 1; j <= (2 * n - 2 * i); j++) {
                System.out.print(" ");
            }
            //再打印*
            for (int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
