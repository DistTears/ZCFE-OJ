import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-20
 * Time: 22:33
 */

class Child {
    int count;//被交换的次数
    int id;//小朋友的位置序号
}

/*
3
3 2 1
---------
9
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//小朋友的个数
        Child[] childs = new Child[n];//学生的位置序号
        for (int i = 0; i < n; i++) {
            childs[i] = new Child();
            childs[i].count = 0;
            childs[i].id = scanner.nextInt();
        }
        for (int i = 1; i <= n - 1; i++) {
            Child c = new Child();
            for (int j = 0; j <= n - i - 1; j++) {
                if (childs[j].id > childs[j + 1].id) {
                    childs[j].count++;
                    childs[j + 1].count++;
                    c = childs[j];
                    childs[j] = childs[j + 1];
                    childs[j + 1] = c;
                }
            }
        }
        int min = 0;
        for (Child c : childs) {
            min += fun(c.count);
        }
        System.out.println(min);
    }

    static int fun(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
