/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-09
 * Time: 15:43
 */
/*
*    话说大诗人李白，一生好饮。幸好他从不开车。
    一天，他提着酒壶，从家里出来，酒壶中有酒2斗。他边走边唱：
    无事街上走，提壶去打酒。
    逢店加一倍，遇花喝一斗。
    这一路上，他一共遇到店5次，遇到花10次，已知最后一次遇到的是花，他正好把酒喝光了。
    请你计算李白遇到店和花的次序，可以把遇店记为a，遇花记为b。则：babaabbabbabbbb就是合理的次序。

    像这样的答案一共有多少呢？请你计算出所有可能方案的个数（包含题目给出的）。
* */
public class Main {
    public static void main(String[] args) {
        System.out.println(f(2, 5, 9, 15));
    }
    public static int f(int a, int b, int c, int d) {
        if (a == 0 || d == 0) {
            return 0;
        }
        if (a == 1 && b == 0 && c == 0 && d == 1) {
            return 1;
        }
        int count = f(a * 2, b - 1, c, d - 1) + f(a - 1, b, c - 1, d - 1);
        return count;
    }
}
