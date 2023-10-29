import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-18
 * Time: 21:56
 */
/*
3 7
1 2 1 5 4 4 1
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int m = scanner.nextInt();//内存中的单元个数
        int n = scanner.nextInt();//文章的长度
        StringBuilder str = new StringBuilder();//单词
        LinkedList<String> queue = new LinkedList<>();//队列
        int count = 0;//查字典的次数
        for (int i = 1; i <= n; i++) {//循环输入单词
            String s = scanner.next();//输入单词
            if (queue.size() == m) {//如果存入==m个，那么把先进去的给出队
                queue.poll();
                str.deleteCharAt(0);
                if (!str.toString().contains(s)) {//如果不存在这个单词，那么就把这个单词添加到队列内存，并连接字符串
                    queue.offer(s);
                    str.append(s);
                    count++;
                }
            } else {//否则就把该单词存入内存
                if (!str.toString().contains(s)) {//如果不存在这个单词，那么就把这个单词添加到队列内存，并连接字符串
                    queue.offer(s);
                    str.append(s);
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
