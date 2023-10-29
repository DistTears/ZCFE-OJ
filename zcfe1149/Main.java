import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-01
 * Time: 11:09
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TreeSet<Integer> set = new TreeSet<>((o1, o2) -> o1 - o2);
        for (int i = 1; i <= n; i++) {
            set.add(scanner.nextInt());
        }
        System.out.println(set.size());
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
    }
}
