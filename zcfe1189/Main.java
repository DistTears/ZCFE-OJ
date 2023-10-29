import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-14
 * Time: 22:53
 */
public class Main {
    //-380 -83
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder s = new StringBuilder(scanner.nextLine());
        if (Integer.parseInt(s.toString()) < 0) {
            String s1 = s.substring(1);
            int num = Integer.parseInt(new StringBuilder(s1).reverse().toString());
            System.out.println(-num);
        } else {
            System.out.println(Integer.parseInt(s.reverse().toString()));
        }
    }
}
