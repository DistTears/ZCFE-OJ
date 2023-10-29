import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt(); // 机器人的总数
        int[][] positions = new int[K][2]; // 存储机器人的位置坐标

        for (int i = 0; i < K; i++) {
            positions[i][0] = scanner.nextInt(); // 读取机器人的x坐标
            positions[i][1] = scanner.nextInt(); // 读取机器人的y坐标
        }

        int totalEnergy = calculateTotalEnergy(positions);
        System.out.println(totalEnergy);
    }

    // 计算总能量消耗的方法
    private static int calculateTotalEnergy(int[][] positions) {
        int minEnergy = Integer.MAX_VALUE;

        // 遍历所有机器人的位置，尝试每一个位置作为集合点
        for (int i = 0; i < positions.length; i++) {
            int x = positions[i][0];
            int y = positions[i][1];
            int energy = 0;

            // 计算每个机器人到该集合点的能量消耗
            for (int j = 0; j < positions.length; j++) {
                energy += Math.abs(x - positions[j][0]) + Math.abs(y - positions[j][1]);
            }

            // 更新最小能量消耗
            minEnergy = Math.min(minEnergy, energy);
        }

        return minEnergy;
    }
}
