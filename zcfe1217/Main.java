import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-23
 * Time: 21:37
 */
/*
3
1 1
2 2
3 3
---------
6
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//输入n条直线
        if (n == 1) {
            System.out.println(1);
            return;
        }
        Line[] lines = new Line[n];
        int count = 2;//部分个数
        for (int i = 0; i < lines.length; i++) {
            lines[i] = new Line();
            lines[i].a = scanner.nextInt();
            lines[i].b = scanner.nextInt();
        }
        for (int i = 1; i < lines.length; i++) {
            if (coincide(lines, i)) {//如果重合，则不做处理
            } else if (par(lines, i)) {//判断该直线是否与直线的直线存在平行
                count++;
            } else {
                count += 2;
            }
        }
        System.out.println(count);
    }

    private static boolean coincide(Line[] lines, int j) {
        for (int i = 0; i < j; i++) {
            if (lines[i].a == lines[j].a && lines[i].b == lines[j].b) {
                return true;
            }
        }
        return false;

    }

    private static boolean par(Line[] lines, int j) {
        for (int i = 0; i < j; i++) {
            if (lines[i].a == lines[j].a) {
                return true;
            }
        }
        return false;
    }
}

class Line {
    int a;//x的系数
    int b;//其他值
}
