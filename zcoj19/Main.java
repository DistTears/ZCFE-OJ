import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] data = new int[n];

            for (int i = 0; i < n; i++) {
                data[i] = scanner.nextInt();
            }

            Arrays.sort(data);

            if (n % 2 == 0) {
                int median1 = data[n / 2 - 1];
                int median2 = data[n / 2];
                int median = (median1 + median2) / 2;
                System.out.println(median);
            } else {
                int median = data[n / 2];
                System.out.println(median);
            }
        }

    }
}
