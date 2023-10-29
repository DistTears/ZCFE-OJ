import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-08
 * Time: 23:01
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int m = scanner.nextInt();//m行序列
        int k = scanner.nextInt();//前k大的数据
        int[] arrLen = new int[m];//序列大的长度
        for (int i = 0; i < m; i++) {
            arrLen[i] = scanner.nextInt();
        }
        ArrayList<Integer[]> list = new ArrayList<>();//存储序列的集合
        Integer[] a;
        for (int i = 0; i < m; i++) {
            a = new Integer[arrLen[i]];
            for (int j = 0; j < arrLen[i]; j++) {
                a[j] = scanner.nextInt();
            }
            //并将数组进行降序排列
            Arrays.sort(a, (o1, o2) -> (o2 - o1));
            list.add(a);
        }
        for (int i = 0; i < list.size(); i++) {
            change(list.get(i));
        }
        for (Integer[] integers : list) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
            System.out.println();
        }
    }

    //对集合中的数组进行处理
    public static void change(Integer[] arr) {
        TreeSet<Integer> set = new TreeSet<>((o1, o2) -> o2 - o1);
        for (Integer integer : arr) {
            set.add(integer);
        }
        int n = 0;
        int i = 1;
        for (Integer integer : set) {
            if (i == 3) {
                n = integer;
            }
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= n) {
                arr[j] = 0;
            }
        }
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
    }
}
