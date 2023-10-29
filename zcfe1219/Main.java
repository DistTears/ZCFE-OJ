import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-23
 * Time: 23:04
 */
/*
5
12 10 15 20 6
---------------
0 3 0 0 7
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//学生人数
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;//题数
            int p = arr[i];
            while (!fun(arr, i)) {
                count++;
                arr[i]++;
            }
            arr[i] = p;
            array[i] = count;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static boolean fun(int[] arr, int j) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == j) {
                continue;
            }
            if (arr[i] > arr[j]) {
                max++;
            } else if (arr[i] < arr[j]) {
                min++;
            }
        }
        if (max <= min) {
            return true;
        } else {
            return false;
        }
    }
}
