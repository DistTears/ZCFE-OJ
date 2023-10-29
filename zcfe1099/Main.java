import java.util.ArrayList;
import java.util.Scanner;

//7       3 1 6 1 6 4 3 1 6 1 6 1 3 7
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while (sum != n * n) {
            int num = scanner.nextInt();
            list.add(num);
            sum += num;
        }
        int flag = 0;
        int k = 0;
        int z = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                flag = 1;
            } else {
                flag = 0;
            }
            for (int j = 1; j <= list.get(i) && k < n && z < n; j++) {
                arr[k][z] = flag;
                z++;
                if (z == n) {
                    k++;
                    z = 0;
                }
            }

        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
