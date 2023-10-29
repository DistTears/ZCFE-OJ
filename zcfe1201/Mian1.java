import java.util.*;

public class Mian1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt(); // 内存容量
        int N = scanner.nextInt(); // 文章长度
        int[] article = new int[N]; // 文章单词

        for (int i = 0; i < N; i++) {
            article[i] = scanner.nextInt();
        }

        int[] memory = new int[M]; // 内存，用于存放单词
        int memorySize = 0; // 当前内存中存放的单词数
        int dictionaryLookups = 0; // 查词典的次数

        for (int i = 0; i < N; i++) {
            int word = article[i];
            boolean foundInMemory = false;

            // 检查内存中是否存在这个单词
            for (int j = 0; j < memorySize; j++) {
                if (memory[j] == word) {
                    foundInMemory = true;
                    break;
                }
            }

            if (!foundInMemory) {
                // 如果内存已满，清空最早进入内存的单词
                if (memorySize == M) {
                    for (int j = 0; j < M - 1; j++) {
                        memory[j] = memory[j + 1];
                    }
                    memorySize--;
                }

                // 存入新单词到内存
                memory[memorySize] = word;
                memorySize++;
                dictionaryLookups++;
            }
        }

        System.out.println(dictionaryLookups);
    }
}
