import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-16
 * Time: 22:45
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Stack stack = new Stack();
        for (int i = 1; i <= n; i++) {
            String s = scanner.nextLine();
            String[] ss = s.split(" ");
            if (ss[0].equals("in")) {
                stack.push(ss[1]);
            } else {
                while (stack.pop() != ss[1]) {

                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(stack.peek());
        }
    }
}
