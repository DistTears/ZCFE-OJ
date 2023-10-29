import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        // 读取输入整数序列，直到遇到 0 结束
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            stack.push(num);
        }

        // 从栈中弹出并反向输出整数序列
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
