import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-15
 * Time: 19:29
 */
/*
【题目描述】

给定N个数，求这N个数的最长上升子序列的长度。

【样例输入】

7

2 5 3 4 1 7 6

【样例输出】

4

 

什么是最长上升子序列？ 就是给你一个序列，请你在其中求出一段不断严格上升的部分，它不一定要连续。

就像这样：2,3,4,7和2,3,4,6就是序列2 5 3 4 1 7 6的两种选取方案。最长的长度是4.
* */
public class Main {
    //思路：双指针暴力寻找
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//输入数字的个数
        int[] array = new int[n];//定义一个数组，存放输入的数字
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();//输入n个数字
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int count = 1;//上升子序列的长度
                int right = j;//右指针
                int left = i;//左指针
                while (right < array.length) {
                    if (array[right] > array[left]) {
                        count++;
                        left = right;
                    }
                    right++;
                }
                max = Math.max(count, max);
            }
        }
        System.out.println(max);
    }
}
