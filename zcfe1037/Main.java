/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-06
 * Time: 21:57
 */
//153=1*1*1+5*5*5+3*3*3
public class Main {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int j = i;
            int sum = 0;
            while (j != 0) {
                int n = j % 10;
                sum += (Math.pow(n, 3));
                j /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }

        }
    }
}
