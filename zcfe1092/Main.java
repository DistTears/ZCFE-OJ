import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-25
 * Time: 13:42
 */
class DateSort {
    public int h;
    public int m;
    public int s;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        DateSort[] sorts = new DateSort[n];
        for (int i = 0; i < n; i++) {
            sorts[i] = new DateSort();
            sorts[i].h = scanner.nextInt();
            sorts[i].m = scanner.nextInt();
            sorts[i].s = scanner.nextInt();
        }
        Arrays.sort(sorts, new Comparator<DateSort>() {
            @Override
            public int compare(DateSort o1, DateSort o2) {
                int i = o1.h - o2.h;
                i = i == 0 ? 0 : o1.m - o2.m;
                i = i == 0 ? 0 : o1.s - o2.s;
                return i;
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(sorts[i].h + " " + sorts[i].m + " " + sorts[i].s);
        }
    }
}
