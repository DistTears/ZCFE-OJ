/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-20
 * Time: 18:47
 */
/*
一个百万富翁遇到一个陌生人，陌生人找他谈了一个换钱的计划。
该计划如下：我每天给你10万元，你第一天给我1分钱，第二天2分钱，第三天4分钱……这样交换30天后，
百万富翁交出了多少钱？陌生人交出了多少钱？（注意一个是万元，一个是分）
* */
public class Main {
    public static void main(String[] args) {
        long rich = 3000000;//富人的钱
        long poor = 0;//穷人的钱
        int j = 1;
        for (int i = 1; i <= 30; i++) {
            poor += j;
            j *= 2;
        }
        poor /= 100;
        System.out.println(poor + " " + rich);
    }
}
