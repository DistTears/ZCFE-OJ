import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String longestGoodString = findLongestGoodString(input);
        System.out.println(longestGoodString);
    }

    public static String findLongestGoodString(String input) {
        String longestGoodString = "";
        String currentGoodString = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentGoodString.isEmpty()) {
                currentGoodString += currentChar;
            } else if (currentGoodString.charAt(0) == currentChar) {
                currentGoodString += currentChar;
            } else {
                if (currentGoodString.length() > longestGoodString.length()) {
                    longestGoodString = currentGoodString;
                }
                currentGoodString = String.valueOf(currentChar);
            }
        }

        if (currentGoodString.length() > longestGoodString.length()) {
            longestGoodString = currentGoodString;
        }

        return longestGoodString;
    }
}
