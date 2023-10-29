import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-18
 * Time: 18:40
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//表示报名参加笔试的选手总数
        int m = scanner.nextInt();//m表示计划录取的志愿者人数
        int[][] array = new int[n][2];//定义n行两列的数组，第一列存储序号，第二列存储成绩
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        //根据第二列进行排序
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int i = o2[1] - o1[1];
                i = (i == 0 ? o1[0] - o2[0] : i);
                return i;
            }
        });//升序排列
        //录取分数根据的名次
        int rank = (int) (m * 1.5);
        int luqu = array[rank - 1][1];//录取的分数
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (array[i][1] >= luqu) {
                num = i;
            }
        }
        //打印最后的结果
        System.out.println(luqu + " " + (num + 1));//录取的分数和录取的人数
        for (int i = 0; i < num + 1; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}