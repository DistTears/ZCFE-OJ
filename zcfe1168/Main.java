import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        String input = scanner.nextLine();//输入链表字符串
        String replace = input.replace("&gt;", ">");//由于输入有问题，所以替换一些字符串
        String result = checkOrder(replace);
        System.out.println(result);
    }

    /*
     * 方法作用：检测输入的链表字符串中的数字关系是升序，降序还是无序
     * 参数：要检测的字符串
     * return：升序，降序，无序的标志
     * */
    public static String checkOrder(String input) {
        List<Integer> values = new ArrayList<>();//集合
        int prevValue = Integer.MIN_VALUE;
        boolean increasing = false;
        boolean decreasing = false;
        //[56->45][23->34][45->23]
        int startIndex = input.indexOf('[');//记录[第一次出现的索引位置
        while (startIndex != -1) {
            int endIndex = input.indexOf(']', startIndex);//记录从startIndex索引开始，]第一次出现的索引位置
            String nodeStr = input.substring(startIndex + 1, endIndex);//类似[56->45]，将56->45切割下来
            String[] parts = nodeStr.split("->");//56->45以->为规则，进行分割成56 45
            int nodeValue = Integer.parseInt(parts[0]);//记录下分割->前面的数字，并于prevValue进行比较

            if (nodeValue > prevValue) {
                increasing = true;//大于说明是增的
            } else if (nodeValue < prevValue) {
                decreasing = true;//小于说明的减的
            }

            values.add(nodeValue);//将该值添加进集合
            prevValue = nodeValue;//修改prevValue的值

            startIndex = input.indexOf('[', endIndex);//继续走向下一个[]链表
        }

        if (increasing && !decreasing) {
            return "INC";
        } else if (decreasing && !increasing) {
            return "DEC";
        } else {
            return "NUL";
        }
    }
}
