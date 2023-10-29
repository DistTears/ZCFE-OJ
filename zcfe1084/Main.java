import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-21
 * Time: 23:04
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder s = new StringBuilder(scanner.nextLine());
        StringBuilder t = new StringBuilder(scanner.nextLine());
        StringBuilder st = s.reverse().append(t.reverse());
        System.out.println(st.toString());
    }
}
