import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//补给站的个数
        int l = scanner.nextInt();//跑道的长度
        int max = scanner.nextInt();//最大的体力
        int max0 = max;//初始体力
        int s = scanner.nextInt();//给的硬币个数
        int len = 0;//小明最大能跑的长度
        int[][] array = new int[n][2];//第一列补给站的位置 第二列补给所需的硬币
        for (int i = 0; i < n; i++) {
            array[i][0] = scanner.nextInt();//输入补给站的位置
            array[i][1] = scanner.nextInt();//输入补给站所需的硬币
        }
        for (int i = 0; i < n; i++) {
            if (max >= (array[i][0] - len)) {//如果体力支持跑到下一补给，则跑过去在此处不补给
                max -= (array[i][0] - len);
                len += (array[i][0] - len);

            } else {//如果体力不支持跑到下一补给，则在这里休息
                if (s >= array[i - 1][1]) {//如果此时硬币够，则体力充满，并跑到下一补给站
                    s -= array[i - 1][1];
                    max = max0;
                    max -= (array[i][0] - len);
                    len += (array[i][0] - len);

                } else {//如果跑不到下一补给，还没钱，那么就爬不到重点
                    System.out.println("No");
                    return;
                }
            }
            if (i == n - 1 && s >= array[i][1] && len + max0 >= l ||
                    i == n - 1 && len + max >= l
            ) {//如果跑到了最后补给栈，此时的体力不够，但是钱够，而且跑的路程+最大体力超过路程
                //或者没钱了，但是跑的路程和剩下体力也大于路程
                System.out.println("Yes");
                return;
            } else if (i == n - 1 && s < array[i][1] && len + max < l) {
                System.out.println("No");
                return;
            }

        }
    }
}
