import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-06
 * Time: 22:47
 */
/*
* [node1-node2][node2-node3]
node2
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        String link = scanner.nextLine();//输入关系图
        String node = scanner.nextLine();//输入要求节点
        Map<String, List<String>> map = new HashMap<>();//键存储节点，值存储相邻节点
        int start = link.indexOf("[");//找到[第一次出现的位置
        for (int i = 0; i < link.length(); i++) {
            int end = link.indexOf("]", start);//找到从start位置开始的]第一次出现的位置
            i = end;
            String spilt = link.substring(start + 1, end);//切割[]中间的字符串
            String[] splits = spilt.split("-");//按照-分割字符串
            map.computeIfAbsent(splits[0], k -> new ArrayList<>()).add(splits[1]);
            map.computeIfAbsent(splits[1], k -> new ArrayList<>()).add(splits[0]);
            //该方法判断map集合中如果存在splits[0]，那么返回map中的值，否则创建一个新的值
            start = end + 1;
        }
        List<String> list = map.get(node);
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
