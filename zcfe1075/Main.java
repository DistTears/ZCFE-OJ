import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            scanner.nextLine(); // 读取换行符

            Map<String, List<String>> graph = new HashMap<>();
            Map<String, Integer> inDegrees = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String[] tokens = scanner.nextLine().split("\\(");
                String task = tokens[0];
                String[] dependencies = tokens[1].replace(")", "").split(",");
                inDegrees.put(task, dependencies.length);
                graph.put(task, new ArrayList<>());
                for (String dependency : dependencies) {
                    if (!dependency.equals("NULL")) {
                        graph.get(dependency).add(task);
                    }
                }
            }

            List<String> result = topologicalSort(graph, inDegrees);
            for (String task : result) {
                System.out.print(task + " ");
            }
            System.out.println();
        }
    }

    private static List<String> topologicalSort(Map<String, List<String>> graph, Map<String, Integer> inDegrees) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new PriorityQueue<>();

        for (Map.Entry<String, Integer> entry : inDegrees.entrySet()) {
            if (entry.getValue() == 0) {
                queue.offer(entry.getKey());
            }
        }

        while (!queue.isEmpty()) {
            String task = queue.poll();
            result.add(task);

            for (String dependent : graph.get(task)) {
                inDegrees.put(dependent, inDegrees.get(dependent) - 1);
                if (inDegrees.get(dependent) == 0) {
                    queue.offer(dependent);
                }
            }
        }

        return result;
    }
}
