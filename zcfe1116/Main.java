import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-27
 * Time: 21:57
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//池塘的数量
        int h = scanner.nextInt();//要出去钓鱼的时间
        h *= 60;//化成分钟
        int[] fi = new int[n];//在第i个池塘能调到的鱼的数量fi
        int[] di = new int[n];//第i个池塘，每过一个时间单元减少的鱼数di
        int[] ti = new int[n - 1];//表示i与i+1池塘间隔所需的时间(到第一个池塘不需要时间)
        int fishSum = 0;//一共钓到的鱼
        for (int i = 0; i < n; i++) {
            fi[i] = scanner.nextInt();//输入fi
        }
        for (int i = 0; i < n; i++) {
            di[i] = scanner.nextInt();//输入di
        }
        for (int i = 0; i < n - 1; i++) {
            ti[i] = scanner.nextInt() * 5;//输入ti
        }
        for (int i = 0; i < n; i++) {//开始一个一个去池塘钓鱼
            for (int j = fi[i]; h > 0 && j >= 0; j -= di[i]) {//把每个池塘的鱼钓完才可以去往下一个池塘
                fi[i] = (j - di[i]) <= 0 ? 0 : j;
                fishSum += j;//鱼的总数相加
                h -= 5;//每相加一次鱼数就减少一个时间单元 - 5分钟

            }
            if (h <= 0 || is(fi) || h < ti[i]) { //循环终止的条件就是钓鱼的时间不够或者每个池塘能钓的鱼数都为0
                break;
            }
            //如果池塘还有鱼，并且时间还够到达下一个池塘，那么就减去中间路程的时间
            h -= ti[i];
        }
        System.out.println(fishSum);//最后的鱼数
    }

    public static boolean is(int[] fi) {
        for (int i = 0; i < fi.length; i++) {
            if (fi[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
