/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-19
 * Time: 22:31
 */
public class Main {
    public static void main(String[] args) {
        for (int a = 0; a < 9; a++) {
            for (int b = 0; b < 9; b++) {
                for (int c = 0; c < 9; c++) {
                    int abc = a * 100 + b * 10 + c;
                    int bcc = b * 100 + c * 10 + c;
                    if (abc + bcc == 532) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}
