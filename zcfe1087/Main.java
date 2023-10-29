import java.util.HashSet;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-22
 * Time: 22:54
 */
public class Main {
    //aaba有8种子串，分别是：a b aa ab ba aab aba aaba
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashSet<String> sets = new HashSet<>();
        int start = 0;
        int len = 1;
        while (len != str.length() + 1) {
            start = 0;
            while (start + len != str.length() + 1) {
                sets.add(str.substring(start, start + len));
                start++;
            }
            len++;
        }
        System.out.println(sets.size());
    }
}
