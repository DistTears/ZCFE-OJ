import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-28
 * Time: 22:40
 */
//40785
public class Main {
    static ArrayList<int[]> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 1; i < 2019; i++) {
            for (int j = 1; j < 2019; j++) {
                int k = 2019 - i - j;
                if (k > 0 && (i != j && i != k && j != k) && f(i, j, k) && fun(i, j, k)) {
                    System.out.println(i + " " + j + " " + k);
                    list.add(new int[]{i, j, k});
                }
            }
        }
        System.out.println(list.size());
    }

    private static boolean fun(int i, int j, int k) {
        for (int n = 0; n < list.size(); n++) {
            if (fun2(list.get(n), i, j, k)) {
                return false;
            }
        }
        return true;
    }

    private static boolean fun2(int[] arr, int m, int j, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == m || arr[i] == j || arr[i] == k) {
                count++;
            }
        }
        return count == 3;
    }

    private static boolean f(int i, int j, int k) {
        String si = Integer.toString(i);
        String sj = Integer.toString(j);
        String sk = Integer.toString(k);
        if (si.contains("2") || si.contains("4") || sj.contains("2") || sj.contains("4")
                || sk.contains("2") || sk.contains("4")) {
            return false;
        }
        return true;
    }
}
