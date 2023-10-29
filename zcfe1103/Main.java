public class Main {
    public static void main(String[] args) {
        // 定义字符数组ch1并赋初值
        char[] ch1 = {'H', 'e', 'l', 'l', 'o', ' ', 'H', 'i', '\0'};

        // 定义字符数组ch2并赋初值
        char[] ch2 = "Nice to Meet You".toCharArray();

        // 输出字符数组ch1的字符串并换行
        System.out.println(ch1);

        // 输出字符数组ch2的字符串并换行
        System.out.println(ch2);

        // 在同一行连续输出字符ch1[1]，ch1[3]，ch1[5]，ch1[7]并换行
        System.out.println(ch1[1] + " " + ch1[3] + " " + ch1[5] + " " + ch1[7]);

        // 在同一行连续输出字符ch2[0]，ch2[2]，ch2[4]，ch2[6]，ch2[8]并换行
        System.out.println(ch2[0] + " " + ch2[2] + " " + ch2[4] + " " + ch2[6] + " " + ch2[8]);
    }
}
/*
#include <stdio.h>

int main() {
    // 定义并初始化字符数组ch1
    char ch1[100] = {'H', 'e', 'l', 'l', 'o', ' ', 'H', 'i', '\0'};

    // 定义并初始化字符数组ch2
    char ch2[50] = "Nice to Meet You";

    // 输出字符数组ch1的字符串并换行
    printf("%s\n", ch1);

    // 输出字符数组ch2的字符串并换行
    printf("%s\n", ch2);

    // 在同一行连续输出字符ch1[1]，ch1[3]，ch1[5]，ch1[7]并换行
    printf("%c%c%c%c\n", ch1[1], ch1[3], ch1[5], ch1[7]);

    // 在同一行连续输出字符ch2[0]，ch2[2]，ch2[4]，ch2[6]，ch2[8]并换行
    printf("%c%c%c%c%c\n", ch2[0], ch2[2], ch2[4], ch2[6], ch2[8]);

    return 0;
}

* */
