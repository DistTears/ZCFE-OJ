import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-10
 * Time: 22:34
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        double n = scanner.nextDouble();
        int sum = 0;
        int[] marks = new int[(int) n];
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }
        Arrays.sort(marks);
        System.out.println(marks[(int) (n - 1)]);
        System.out.println(marks[0]);
        System.out.format("%.2f",sum / n);
    }
}
