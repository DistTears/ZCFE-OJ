import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-19
 * Time: 22:19
 */

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            set.add(scanner.nextInt());
        }
        System.out.println(set.size());
        for (Integer i : set) {
            System.out.print(i + " ");
        }
    }
}
