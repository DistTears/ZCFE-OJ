import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-18
 * Time: 23:19
 */
//1 2 3
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//人数
        int k = scanner.nextInt();//序号
        int m = scanner.nextInt();//报数到m
        ArrayList<Integer> list = new ArrayList<>();//集合
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int id = 1;
        int start = (k % n) - 1;//1
        while (!list.isEmpty()) {
            int index = start % list.size();
            if (id == m) {
                System.out.println(list.remove(index));
                start++;
            } else {
                id++;
                start++;
            }

        }
    }
}
