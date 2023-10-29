import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-21
 * Time: 21:37
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//考生的人数
        int m = scanner.nextInt();//考试的题数
        int g = scanner.nextInt();//录取分数线
        int[] mark = new int[m];//m道题目对应的分数
        int e = 0;
        int sum = 0;//考生的总成绩
        String[][] arr = new String[n][2];//第一列存入考生序号，第二列存入成绩
        int count = 0;//录取的人数
        for (int i = 0; i < m; i++) {
            mark[i] = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            sum = 0;
            String id = scanner.next();//输入学号
            int num = scanner.nextInt();//做对的题目数量
            for (int j = 1; j <= num; j++) {
                int title = scanner.nextInt();//作对题目的序号
                sum += mark[title - 1];
            }

            if (sum >= g) {//大于录取分数线
                count++;
                arr[e][0] = id;
                arr[e][1] = Integer.toString(sum);
                e++;
            }
        }
        int f = scanner.nextInt();
        //对数组进行排序先按照成绩，再按照学号
        Arrays.sort(arr, (o1, o2) -> {
            int i = Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
            i = (i == 0 ? o1[0].compareTo(o2[1]) : i);
            return i;
        });
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i][0] + " " + arr[i][1]);
            System.out.println();
        }
    }
}
