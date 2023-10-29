import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入字符串
        String input = scanner.nextLine();

        // 读取目标节点名称
        String targetNode = scanner.nextLine();

        // 调用函数获取结果并输出
        input = input.replace("&gt;", ">");
        String result = findBidirectionalNeighbors(input, targetNode);
        System.out.println(result);
    }

    // 函数实现
    private static String findBidirectionalNeighbors(String input, String targetNode) {
        Map<String, List<String>> adjacencyList = new HashMap<>();

        // 解析图连接关系的字符串
        String[] edges = input.split("\\]\\s*\\[");
        for (String edge : edges) {
            String[] nodes = edge.replaceAll("\\[|\\]", "").split("->");
            adjacencyList.computeIfAbsent(nodes[0], k -> new ArrayList<>()).add(nodes[1]);
        }

        // 查找双向连通的邻节点
        List<String> neighbors = new ArrayList<>();
        for (String node : adjacencyList.keySet()) {
            if (isBidirectionalConnected(adjacencyList, targetNode, node)) {
                neighbors.add(node);
            }
        }

        // 输出结果
        if (neighbors.isEmpty()) {
            return "NULL";
        } else {
            return String.join(" ", neighbors);
        }
    }

    // 判断两节点是否双向连通
    private static boolean isBidirectionalConnected(Map<String, List<String>> adjacencyList, String start, String end) {
        return adjacencyList.getOrDefault(start, Collections.emptyList()).contains(end) &&
                adjacencyList.getOrDefault(end, Collections.emptyList()).contains(start);
    }
}
