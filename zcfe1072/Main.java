/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-19
 * Time: 22:24
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int num = i * 9;
            int j = change(i);
            if (num == j) {
                System.out.println(i);
            }
        }
    }

    private static int change(int i) {
        int num = 0;
        int j = 1000;
        while (i != 0) {
            int a = i % 10;
            num += a * j;
            i /= 10;
            j /= 10;
        }
        return num;
    }
}
