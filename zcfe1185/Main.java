import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tribePopulation = new int[n];
        for(int i =0 ;i<n;i++){
            tribePopulation[i] = scanner.nextInt();
        }

        int result = findMinCostToUniteTribes(n, tribePopulation);
        System.out.println(result);
    }

    public static int findMinCostToUniteTribes(int n, int[] tribePopulation) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        Arrays.sort(tribePopulation);

        for (int i = 0; i < n; i++) {
            minHeap.add(tribePopulation[i]);
        }

        int totalCost = 0;

        while (minHeap.size() > 1) {
            int tribe1 = minHeap.poll();
            int tribe2 = minHeap.poll();
            int cost = tribe1 + tribe2;
            totalCost += cost;
            minHeap.add(cost);
        }

        return totalCost;
    }
}
