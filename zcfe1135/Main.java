import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        int totalScore = (int) (A * 0.2 + B * 0.3 + C * 0.5);
        System.out.println(totalScore);
    }
}
