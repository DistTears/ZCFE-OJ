import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//输入流
        String num = sc.next();//输入车牌的序号
        int sum = sc.nextInt();//输入车辆的最大承重
        int part1 = sc.nextInt();//输入车辆的已经载重
        int part2 = sum - part1;//车辆的最大的剩余载量
        int type = sc.nextInt();//输入车站的货箱种类个数
        int[][] arr = new int[type][2];//二维数组，第一列存储货箱数量，第二列存储每个货箱的重量
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();//输入货箱数量和重量
            }
        }
        Greedy(num, part2, type, arr);
    }

    public static void Greedy(String num, int part2, int type, int[][] arr) {
        float[][] arr1 = new float[type][2];//二维数组，第一列存储货箱序号，第二列存储
        for (int i = 0; i < type; i++) {
            arr1[i][0] = i;
            arr1[i][1] = (float) arr[i][1] / arr[i][0];
        }
        Arrays.sort(arr1, new Comparator<float[]>() {  //二维数组排序
            @Override
            public int compare(float[] o1, float[] o2) {
                if (o1[1] - o2[1] > 0) {
                    return -1;
                } else {                    //float类型不能直接返回值返回-1，1进行排序
                    return 1;
                }
            }
        });
        int answer = 0;
        for (int i = 0; i < type; i++) { //通过arr的下标就是arr1中的编号
            if (arr[(int) arr1[i][0]][0] * arr[(int) arr1[i][0]][1] <= part2) {
                part2 -= arr[(int) arr1[i][0]][0] * arr[(int) arr1[i][0]][1];
                answer += arr[(int) arr1[i][0]][1];
            }
        }
        System.out.println(num + "+" + answer);
    }
}