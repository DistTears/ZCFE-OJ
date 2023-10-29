import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> set = new ArrayList<>();

        // 读取集合元素
        String[] elements = scanner.nextLine().split(" ");
        for (String element : elements) {
            set.add(Integer.parseInt(element));
        }

        // 计算子集元素之和
        int sum = 0;
        for (int i = 0; i < (1 << set.size()); i++) {
            ArrayList<Integer> subset = new ArrayList<>();
            for (int j = 0; j < set.size(); j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(set.get(j));
                }
            }
            int subsetSum = 0;
            for (int num : subset) {
                subsetSum += num;
            }
            sum += subsetSum;
        }

        // 输出结果
        System.out.println(sum);
    }
}
