import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//同学的个数
        double piece = scanner.nextDouble();//配件的价格
        double money = 0;//购买所需要的钱
        scanner.nextLine();//吃掉换行符
        StringBuilder sb = new StringBuilder();//同学们的所有需求
        for (int i = 1; i <= n; i++) {
            sb.append(scanner.next());//循环输入同学的需求
        }
        HashMap<Character, Integer> map = new HashMap<>();//键存放配件 值存放配件的个数
        for (int i = 0; i < sb.length(); i++) {
            map.put(sb.charAt(i), map.getOrDefault(sb.charAt(i), 0) + 1);//将ABCD四种配件和数量，存入map集合中
        }
        //判断ABCD是否都存在,都<=0了则结束循环
        while (fourOk(map)) {
            if (fourAll(map)) {
                //如果ABCD都存在，那么ABCD各自-1，每次采购200元
                map.put('A', map.getOrDefault('A', 0) - 1);
                map.put('B', map.getOrDefault('B', 0) - 1);
                map.put('C', map.getOrDefault('C', 0) - 1);
                map.put('D', map.getOrDefault('D', 0) - 1);
                money += 200;
            } /*else if () {
                //如果存在三个，并且，能被3除尽或者既不能被三除尽也不能被2除尽，那么就三个三个的买
            } else if () {
                //如果存在三个，并且能被2除尽，那么就2个2个的买
            } else {
                //最后只剩一个，买完
            }*/
        }

    }

    //判断同学们的需求是否存在ABCD
    private static boolean fourAll(HashMap<Character, Integer> map) {
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() <= 0) {
                return false;
            }
        }
        return true;
    }

    //判断ABCD同学们的需求是否采购完毕
    private static boolean fourOk(HashMap<Character, Integer> map) {
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() > 0) {
                return false;
            }
        }
        return true;
    }
}
