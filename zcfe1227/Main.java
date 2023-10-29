
import java.util.Scanner;

/**
 * 任意进制转换为  十 进制
 *
 * @author 时光·漫步
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int jinzhi = 9;

        String str = "2022";

        int num = Integer.valueOf(str, jinzhi);
        System.out.println(num);
    }
}