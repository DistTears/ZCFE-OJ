import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入
        int n = scanner.nextInt(); // 河的宽度
        int x = scanner.nextInt(); // 需要去学校的天数

        int[] heights = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            heights[i] = scanner.nextInt();
        }

        // 计算最低跳跃能力
        int minJump = findMinJump(n, x, heights);

        // 输出结果
        System.out.println(minJump);
    }

    // 函数用于计算最低跳跃能力
    private static int findMinJump(int n, int x, int[] heights) {
        int minJump = 0;

        // 使用二分查找找到最低和最高的跳跃能力
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (canCross(heights, mid, x)) {
                // 如果当前跳跃能力可以完成x天的课程，尝试减小跳跃能力
                high = mid - 1;
                minJump = mid;
            } else {
                // 如果当前跳跃能力无法完成x天的课程，尝试增大跳跃能力
                low = mid + 1;
            }
        }

        return minJump;
    }

    // 函数用于判断给定的跳跃能力是否可以完成x天的课程
    private static boolean canCross(int[] heights, int jumpCapacity, int x) {
        int days = 0; // 记录已经上课的天数
        int currentJump = 0; // 当前跳跃能力

        for (int height : heights) {
            // 计算使用当前跳跃能力能否跳到下一块石头
            int requiredJump = (height + jumpCapacity - 1) / jumpCapacity;

            if (currentJump + requiredJump > x) {
                return false; // 无法完成x天的课程
            }

            // 更新已经上课的天数和当前跳跃能力
            days += requiredJump;
            currentJump = (height + jumpCapacity - 1) / jumpCapacity;
        }

        return days <= x;
    }
}
