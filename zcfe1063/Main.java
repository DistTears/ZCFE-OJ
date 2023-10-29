/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-16
 * Time: 23:07
 */
/*
思路：

根据样例分析，容易得知，右括号匹配左括号的不同方式跟左括号的个数有关。
有三个左括号即可随机匹配三种左括号...以此类推。
题目保证输入的字符串是合法的，那么第一个一定是左括号“（”
循环判断，当遇到“（”时候左括号计数+1，当遇到“）”时，先计算能有多少种匹配方法（与左括号数有关），再删除一个左括号，左括号计数-1。
最后求模，最好每次算method的时候都求下模。
* */

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long num_zuo = 1, method = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                num_zuo++;
            } else {
                method *= num_zuo;
                method %= 1000000007;
                num_zuo--;
            }
        }
        System.out.print(method % 1000000007);
    }
}

