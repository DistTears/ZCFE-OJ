import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-10
 * Time: 22:56
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(scanner.next());
        }
        list.sort((o1, o2) -> o2.compareTo(o1));
        StringBuilder str = new StringBuilder();
        for (String s : list) {
            str.append(s);

        }
        System.out.println(str);
    }
}
