import java.math.BigInteger;
import java.util.Scanner;

/**
* Created with IntelliJ IDEA.
* Description:
* User: 陈磊
* Date: 2023-10-19
* Time: 23:30
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        BigInteger as = new BigInteger(a);
        BigInteger bs = new BigInteger(b);
        System.out.println(as.add(bs));
    }
}
