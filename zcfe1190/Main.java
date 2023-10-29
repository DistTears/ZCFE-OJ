import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-14
 * Time: 23:47
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j != 0) {
                int x = j % 10;
                if(x == m){
                    count++;
                }
                j /= 10;
            }
        }
        System.out.println(count);
    }
}
