import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-19
 * Time: 21:51
 */

/*
3 2
-----
#2: A->B
7
* */
    //1 2 3 4 5
public class Main {
    static int count = 0;//移动的次数

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//盘子的个数
        int m = scanner.nextInt();//第M步
        count = hanio(n, m, "A", "B", "C");//汉诺塔递归函数
        System.out.println(count);
    }
    public static int hanio(int n, int m, String pos1, String pos2, String pos3) {
        if (n == 1) {
            //直接由初始位置,移到目标位置
            count++;
            if (count == m) {
                System.out.println("#" + count + ": " + pos1 + "->" + pos3);
            }
        } else {
            //需要中转位置的参与
            hanio(n - 1, m, pos1, pos3, pos2);
            //A盘上的n-1个通过C盘移动到B盘
            count++;
            if (count == m) {
                System.out.println("#" + count + ": " + pos1 + "->" + pos3);
            }
            hanio(n - 1, m, pos2, pos1, pos3);
            //B盘上的n-1个再通过A盘移动到C盘
        }
        return count;
    }
}
