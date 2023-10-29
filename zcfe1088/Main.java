import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-24
 * Time: 17:04
 */
//ykjygvedtysvyymzfizzwkjamefxjnrnphqwnfhrnbhwjhqcgqnplodeestu
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();//S串
        HashMap<String, Integer> map = new HashMap<>();//用于存放s串中的所有字母
        int min = Integer.MAX_VALUE;
        ;//最小的长度
        for (int i = 0; i <= 25; i++) {
            //如果map集合中不存在字母就添加进，并把值初始化为1
            map.put(Character.toString('a' + i), 1);
        }
        int left = 0;//左指针
        int right = 0;
        while (right < s.length()) {
            if (map.containsKey(Character.toString(s.charAt(right)))) {
                map.put(Character.toString(s.charAt(right)), map.getOrDefault(Character.toString(s.charAt(right)), 0) - 1);
            }


            //集合中的键对应的值都为0的时候，说明此时left和right包含所有的字母
            while (all(map)) {
                min = Math.min(min, right - left + 1);
                if (map.containsKey(Character.toString(s.charAt(left)))) {
                    map.put(Character.toString(s.charAt(left)), map.getOrDefault(Character.toString(s.charAt(left)), 0) + 1);
                }
                left++;
            }
            right++;

        }
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);//最后打印的就是最小长度
    }

    public static boolean all(HashMap<String, Integer> map) {
        Set<String> set = map.keySet();
        for (String s : set) {
            int v = map.get(s);
            if (v > 0) {
                return false;
            }
        }
        return true;
    }
}
