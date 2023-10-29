import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-01
 * Time: 13:47
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//人数
        Person[] people = new Person[n];
        int a = 0;//接种疫苗a的人数
        int b = 0;//接种疫苗b的人数
        for (int i = 0; i < n; i++) {
            people[i] = new Person();
            people[i].address = scanner.next();
            people[i].color = scanner.next();
            people[i].cond = scanner.next();
            people[i].result = scanner.next();
            people[i].day = scanner.nextInt();
            if (people[i].color.equals("G") || people[i].equals("N") && people[i].day < 3) {
                if (people[i].address.equals("L") && people[i].cond.equals("E")
                        || people[i].address.equals("T") && people[i].cond.equals("E")) {
                    b++;
                } else if (people[i].address.equals("L") && people[i].cond.equals("D")) {
                    a++;

                }
            }

        }
        System.out.println(a + " " + b);
    }
}

class Person {
    String address;//本地还是外地
    String color;//健康码颜色
    String cond;//疫苗接种情况
    String result;//核酸检测结果
    int day;//最近一次核酸检测时间

}
