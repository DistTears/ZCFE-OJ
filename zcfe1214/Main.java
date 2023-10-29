import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-22
 * Time: 21:40
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int day = scanner.nextInt();//表示要吃的天数
        int types = scanner.nextInt();//表示巧克力的种类
        int count = 0;//巧克力的总个数
        Chocolate[] cs = new Chocolate[types];
        if (types == 0) {
            System.out.println(-1);
            return;
        }
        int money = 0;//表示要付的钱
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new Chocolate();
            cs[i].price = scanner.nextInt();
            cs[i].date = scanner.nextInt();
            cs[i].number = scanner.nextInt();
            count += cs[i].number;
        }
        if (count < day) {
            System.out.println(-1);
            return;
        }
        /*
10 3
1 6 5
2 7 3
3 10 10
--------------
18
* */
        Arrays.sort(cs, (o1, o2) -> {//先按照单价，再按照保质期
            int i = o1.price - o2.price;
            i = i == 0 ? o1.date - o2.date : i;
            return i;
        });//拿单价进行升序排列
        int d = 1;//已经过去的天数，用来判断保质期
        for (Chocolate c : cs) {
            for (int i = 1; i <= c.number && d <= c.date && d <= day; i++, d++) {
                money += c.price;
            }
        }
        System.out.println(money);

    }
}

class Chocolate {
    int price;//单价
    int date;//保质期
    int number;//数量
}
