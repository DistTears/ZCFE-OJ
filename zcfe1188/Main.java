import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1);
                String modifiedWord = firstChar + restOfWord.replaceAll("\\d+", "_$0_");
                result.append(modifiedWord).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
}
