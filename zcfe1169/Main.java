import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-05
 * Time: 22:37
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//学生人数
        int[] marks = new int[n];//学生分数
        HashMap<String, Integer> map = new HashMap<>();//键存放等级，值存放个数
        for (int i = 0; i < n; i++) {
            int mark = scanner.nextInt();
            if (mark >= 85) {
                map.put("A", map.getOrDefault("A", 0) + 1);
            } else if (mark >= 75) {
                map.put("B", map.getOrDefault("B", 0) + 1);

            } else if (mark >= 60) {
                map.put("C", map.getOrDefault("C", 0) + 1);

            } else {
                map.put("D", map.getOrDefault("D", 0) + 1);
            }
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
