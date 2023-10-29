import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-05
 * Time: 21:22
 */

public class Main {
    public static void main(String[] args) {
        //成绩集合
        ArrayList<Integer> list = new ArrayList<>();
        //评价集合
        String[] remark = new String[]{"fail", "pass", "excellent", "wa"};
        //输入成绩的个数
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //循环输入成绩
        while (num != 0) {
            int mark = scanner.nextInt();
            list.add(mark);
            num--;
        }
        //遍历集合,打印评价
        for (Integer integer : list) {
            if (integer >= 0 && integer < 60) {
                System.out.println(remark[0]);
            } else if (integer >= 60 && integer < 80) {
                System.out.println(remark[1]);

            } else if (integer >= 80 && integer <= 100) {
                System.out.println(remark[2]);
            } else {
                System.out.println(remark[3]);
            }
        }
    }
}
