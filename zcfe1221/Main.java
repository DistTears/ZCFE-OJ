import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-24
 * Time: 22:28
 */
//参考
// https://blog.csdn.net/qq_39391544/article/details/124060739
// 的思想
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(5);
        int mod = 1000000007;
        for (int i = 4; i <= n; i++) {
            list.add(((2 * list.get(i - 1) % mod + list.get(i - 3) % mod)) % mod);
        }
        System.out.println(list.get(n));
    }
}
