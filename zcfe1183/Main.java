import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine(); // 读取输入的单词
        int t = Integer.parseInt(scanner.nextLine()); // 读取输入的整数 t

        String result = findSmallest(word, t);
        System.out.println(result);
    }
//LANQIAO
    public static String findSmallest(String word, int t) {
        char[] charArray = word.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : charArray) {
            while (!stack.isEmpty() && t > 0 && stack.peek() > c) {
                stack.pop();
                t--;
            }
            stack.push(c);
        }

        while (t > 0) {
            stack.pop();
            t--;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
}
