import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-01
 * Time: 16:52
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();//直径
        int height = scanner.nextInt();//水面到,瓶口的距离
        double toole = 3 * Math.pow(len / 2, 2) * (height - 2);//需要填充的体积
        System.out.println((int) (Math.ceil(toole / 8)));
    }
}
