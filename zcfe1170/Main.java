import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-05
 * Time: 22:44
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int m = scanner.nextInt();
            sum += m;
            list.add(m);
        }
        for (int i = 0; i < n; i++) {
            int num = list.get(i);
            if (Math.pow(num, 3) > sum) {
                list2.add(num);
            }
        }
        for (Integer integer : list2) {
            System.out.print(integer + " ");
        }
    }
}
