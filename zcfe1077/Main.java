import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-20
 * Time: 23:57
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();//完数
        ArrayList<Integer> list2 = new ArrayList<>();//应数
        int sum = 0;
        for (int i = 2; i <= 60; i++) {
            list.clear();
            sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    list.add(j);
                }
            }
            for (Integer integer : list) {
                sum += integer;
            }
            if (sum == i) {
                list1.add(i);
            } else if (sum > i) {
                list2.add(i);
            }
        }
        System.out.print("E:");
        for (Integer integer : list1) {
            System.out.print(" " + integer);
        }
        System.out.println();
        System.out.print("G:");
        for (Integer integer : list2) {
            System.out.print(" " + integer);
        }
    }
}
