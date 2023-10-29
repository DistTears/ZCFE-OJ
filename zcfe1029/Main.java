import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-05
 * Time: 17:49
 */
/*
 * 编写程序，读入一个整数并检查它是不是偶数。
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println((num % 2) == 0);
    }
}
