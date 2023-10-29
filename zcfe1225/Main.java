import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-25
 * Time: 23:07
 */
/*
4 2
1 2 3 4
-------------
6
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            list.add(scanner.nextInt());
        }
        while (list.size() != 0) {
            if (list.size() >= k) {
                for (int i = 0; i < k; i++) {
                    list.set(i, list.get(i) - 1);

                }
                count++;
            } else {
                for (int i = 0; i < list.size(); i++) {
                    list.set(i, list.get(i) - 1);
                    count++;
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 0) {
                    list.remove(i);
                }
            }
        }
        System.out.println(count);
    }
}
