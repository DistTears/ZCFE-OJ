import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-21
 * Time: 23:24
 */
/*
2
aabbaa
----------
2
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int k = scanner.nextInt();//k
        scanner.nextLine();
        String s = scanner.nextLine();//字符串
        int count = 0;
        if (s.length() % k != 0) {
            System.out.println(-1);
            return;
        }
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i += k) {
            map.put(s.substring(i, i + k), map.getOrDefault(s.substring(i, i + k), 0) + 1);
        }
        String minkey = "";
        int min = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < min) {
                minkey = entry.getKey();
            }
        }
        String rekey = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (!entry.getKey().equals(minkey)) {
                rekey = entry.getKey();
            }
        }
        for (int i = 0; i < rekey.length(); i++) {
            if (minkey.charAt(i) != rekey.charAt(i)) {
                count++;
            }
        }
        System.out.println(count == 0 ? -1 : count);
    }
}
