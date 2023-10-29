import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//输入1~n的值
        BigInteger lcm = calculateLCM(n);//求最小公倍数
        System.out.println(lcm);
    }

    // 计算最小公倍数的方法
    public static BigInteger calculateLCM(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger currentNumber = BigInteger.valueOf(i);//将i转换为BigInteger对象(参数可以是int或者long)
            result = result.multiply(currentNumber).divide(result.gcd(currentNumber));
            //multiply方法：让result去乘以currentNumber
            //divide方法：让 result.multiply(currentNumber)的值去除以result.gcd(currentNumber)
            //gcd方法，求得result和currentNumber的最大公约数
        }

        return result;
    }
}
