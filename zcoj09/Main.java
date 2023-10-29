import java.util.Scanner;

/**
* Created with IntelliJ IDEA.
* Description:
* User: 陈磊
* Date: 2023-10-10
* Time: 14:27
*/

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double m = scanner.nextInt();
        System.out.format("%.9f",n/m);
    }
}
