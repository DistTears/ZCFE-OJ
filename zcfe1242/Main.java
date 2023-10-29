import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-28
 * Time: 23:32
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].mark = scanner.nextInt();
            s[i].name = scanner.next();
        }
        Arrays.sort(s, (o1, o2) -> {
            return o2.mark - o1.mark;
        });
        System.out.println(s[0].name);
    }
}

class Student {
    int mark;
    String name;
}
