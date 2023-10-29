import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-08
 * Time: 22:36
 */
//root[leaf1[]branch[leaf2[]]]
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        String treeSet = scanner.nextLine();//输入数结构的字符串
        int n = scanner.nextInt();//输入要搜索的层数
        Map<Integer, List<String>> map = new TreeMap<>();//键存储层数，值存储该层具有的节点
        int floor = 1;//层数
        int start = 0;//记录[符号的位置
        for (int i = 0; i < treeSet.length(); i++) {
            if (treeSet.charAt(i) == '[') {
                map.put(floor, map.computeIfAbsent(floor, k -> new ArrayList<>())).add(treeSet.substring(start + 1, i));
                start = i;
                if (treeSet.charAt(i + 1) != ']') {
                    floor++;
                } else {
                    start = i + 1;
                }
            }
        }
        System.out.println(String.join(" ", map.get(n)));
    }
}
