import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int totalCoins = 0;
        int day = 1;

        for (int i = 1; i <= n; day++) {
            for (int j = 1; j <= day && i <= n; j++, i++) {
                totalCoins += day;
            }
        }

        System.out.println(totalCoins);
    }
}
