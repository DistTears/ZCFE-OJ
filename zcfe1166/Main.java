import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        String id = scanner.next();//车头编号
        int maxCarWeight = scanner.nextInt();//车头的最大载重
        int goodsWeighted = scanner.nextInt();//已经装载的货物重量
        int n = scanner.nextInt();//n个货物的车厢
        int[][] carGoods = new int[n][2];//第一列存储车厢的重量 第二列存储车厢的数量
        for (int i = 0; i < n; i++) {
            carGoods[i][0] = scanner.nextInt();//车厢的重量
            carGoods[i][1] = scanner.nextInt();//车厢的数量
        }
        Arrays.sort(carGoods, (o1, o2) -> o1[0] - o2[0]);//按照货物重量进行排序
        int left = 0;//慢指针
        int max = 0;//承载车厢最大的数量
        int sum = 0;//车厢的数量
        System.out.println(id + "+" + max);
    }


}
