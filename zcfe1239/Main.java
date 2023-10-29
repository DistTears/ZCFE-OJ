import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int n1 = s1.length();
        int n2 = s2.length();

        // 创建两个哈希表来存储每个字符串中子串的出现次数
        Map<String, Integer> substrCount1 = new HashMap<>();
        Map<String, Integer> substrCount2 = new HashMap<>();

        // 遍历第一个字符串，计算所有可能的子串，并存储其出现次数
        for (int i = 0; i < n1; i++) {
            for (int j = i + 1; j <= n1; j++) {
                String substr = s1.substring(i, j);
                substrCount1.put(substr, substrCount1.getOrDefault(substr, 0) + 1);
            }
        }

        // 遍历第二个字符串，计算所有可能的子串，并存储其出现次数
        for (int i = 0; i < n2; i++) {
            for (int j = i + 1; j <= n2; j++) {
                String substr = s2.substring(i, j);
                substrCount2.put(substr, substrCount2.getOrDefault(substr, 0) + 1);
            }
        }

        int result = 0;

        // 遍历第一个字符串中的所有子串，查看在第二个字符串中是否存在相同的子串
        for (String substr1 : substrCount1.keySet()) {
            if (substrCount2.containsKey(substr1)) {
                result += substrCount1.get(substr1) * substrCount2.get(substr1);
            }
        }

        System.out.println(result);
    }
}
