import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-01
 * Time: 17:05
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//人数
        String subject = scanner.next();//要比赛的科目
        Student[] s = new Student[n];
        int china = 0;
        int math = 0;
        int physic = 0;
        int mempic = 0;
        int polit = 0;
        int history = 0;
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].id = scanner.next();//序号
            china = scanner.nextInt();//语文
            math = scanner.nextInt();//数学
            physic = scanner.nextInt();//物理
            mempic = scanner.nextInt();//化学
            polit = scanner.nextInt();//政治
            history = scanner.nextInt();//历史
            s[i].sumB = math + mempic;
            s[i].sumI = physic + math;
            s[i].sumH = polit + history;
        }
        Arrays.sort(s, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = 0;
                if (subject.equals("B")) {
                    i = o2.sumB - o1.sumB;
                } else if (subject.equals("I")) {
                    i = o2.sumI - o1.sumI;
                } else if (subject.equals("H")) {
                    i = o2.sumH - o1.sumH;
                }
                return i;
            }
        });
        int max = 0;
        if (subject.equals("B")) {
            max = s[0].sumB;
            for (Student student : s) {
                if (student.sumB == max) {
                    System.out.println(student.id);
                }
            }
        } else if (subject.equals("I")) {
            max = s[0].sumI;
            for (Student student : s) {
                if (student.sumI == max) {
                    System.out.println(student.id);
                }
            }
        } else if (subject.equals("H")) {
            max = s[0].sumH;
            for (Student student : s) {
                if (student.sumH == max) {
                    System.out.println(student.id);
                }
            }
        }
    }
}

class Student {
    String id;//序号
    int sumB;//化学和数学总分
    int sumI;//物理和数学总分
    int sumH;//政治和历史总分
}
