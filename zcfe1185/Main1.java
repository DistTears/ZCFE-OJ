import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-12
 * Time: 22:47
 */
public class Main1 {
    //9 1 3 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int money = 0;
        for (int i = 1; i <= n; i++) {
            list.add(scanner.nextInt());
        }
        list.sort((o1, o2) -> o1 - o2);
        //1 3 5 9
        //4 5 9 m-4
        //9 9 m-13
        //
        while (list.size() != 1) {
            money += list.get(0) + list.get(1);
            list.set(0, list.get(0) + list.get(1));
            list.remove(1);
        }
        System.out.println(money);
    }
}
