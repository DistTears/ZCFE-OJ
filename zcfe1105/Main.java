/**
* Created with IntelliJ IDEA.
* Description:
* User: 陈磊
* Date: 2023-09-26
* Time: 15:48
*/public class Main {
    /*
    #include <stdio.h>
#include <string.h>

int main() {
    char firstLine[101]; // 存储第一行的字符串
    char inputLine[100][101]; // 存储包含空格的字符串的数组
    int lineCount = 0; // 行数计数器

    // 读取第一行
    scanf("%s", firstLine);

    // 读取包含空格的字符串，直到达到100行或遇到EOF
    while (scanf(" %[^\n]", inputLine[lineCount]) != EOF && lineCount < 100) {
        lineCount++;
    }

    // 输出第一行和连接后的字符串
    printf("%s%s\n", inputLine[0], firstLine);

    // 输出每行的最后一个字符
    for (int i = 1; i < lineCount; i++) {
        int len = strlen(inputLine[i]);
        if (len > 0) {
            printf("%c", inputLine[i][len - 1]);
        }
    }
    printf("\n");

    // 输出总行数
    printf("%d\n", lineCount + 1);

    return 0;
}

    * */
}
