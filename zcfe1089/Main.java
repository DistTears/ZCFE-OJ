import java.util.Scanner;
import java.util.Stack;

public class Main {
    //3[a2[b]c]
    public static String decompress(String compressedStr) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int currentCount = 0;
        //3[a2[b]c]
        for (char c : compressedStr.toCharArray()) {
            if (Character.isDigit(c)) {
                currentCount = currentCount * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(currentCount);
                strStack.push(currentStr.toString());
                currentCount = 0;
                currentStr = new StringBuilder();
            } else if (c == ']') {
                int repeatCount = countStack.pop();
                StringBuilder repeatedStr = new StringBuilder();
                for (int i = 0; i < repeatCount; i++) {
                    repeatedStr.append(currentStr);
                }
                currentStr = new StringBuilder(strStack.pop() + repeatedStr);
            } else {
                currentStr.append(c);
            }
        }

        return currentStr.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String compressedStr = scanner.nextLine();
        String decompressedStr = decompress(compressedStr);
        System.out.println(decompressedStr);
    }
}
