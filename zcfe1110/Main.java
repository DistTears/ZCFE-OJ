import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] coords = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                coords[i][j] = scanner.nextInt();
            }
        }
        int minDist = findMinDistance(coords);
        System.out.println(minDist);
    }

    private static int findMinDistance(int[][] coords) {
        int n = coords.length;
        int[] xCoords = new int[n];
        int[] yCoords = new int[n];
        for (int i = 0; i < n; i++) {
            xCoords[i] = coords[i][0];
            yCoords[i] = coords[i][1];
        }

        Arrays.sort(xCoords);
        Arrays.sort(yCoords);

        int medianX = xCoords[n / 2];
        int medianY = yCoords[n / 2];

        int ZS = 0;
        for (int i = 0; i < n; i++) {
            ZS += Math.abs(coords[i][0] - medianX) + Math.abs(coords[i][1] - medianY);
        }

        return ZS;
    }
}