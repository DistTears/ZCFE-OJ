import java.util.Scanner;

/**
* Created with IntelliJ IDEA.
* Description:
* User: 陈磊
* Date: 2023-10-10
* Time: 15:03
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        System.out.format("%f\n",n);
        System.out.format("%.5f\n",n);
        System.out.format("%e\n",n);
        System.out.format("%g\n",n);
    }
}
