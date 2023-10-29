import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-23
 * Time: 18:45
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        if (mark >= 60) {
            System.out.println("jige,gangganghao");
        } else {
            System.out.println("laoshi,caicai,laolao");
        }
    }
}
