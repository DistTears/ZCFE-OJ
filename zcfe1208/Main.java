import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-19
 * Time: 23:39
 */
class Tree {
    int height;//深度
    int sum;//权重之和
}

public class Main {
    /*
    7
1 6 5 4 3 2 1
-----------------
2
    * */
    public static void main(String[] args) {
        int count = 1;//层的结点数
        int he = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//一共的节点数
        int h = n / 2;//总共的层数
        Tree[] trees = new Tree[h];
        int j = 1;
        while (he < h && j <= n + 1) {
            trees[he] = new Tree();
            for (int i = 1; i <= count; i++) {
                int num = scanner.nextInt();
                trees[he].sum += num;
                j++;
            }
            trees[he].height = he + 1;
            he++;
            count *= 2;
        }
        Arrays.sort(trees, (o1, o2) -> {
            int i = o2.sum - o1.sum;
            i = i == 0 ? o1.height - o2.height : i;
            return i;
        });
        System.out.println(trees[0].height);
    }
}
