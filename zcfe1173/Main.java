import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-07
 * Time: 23:21
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//学生的人数
        int m = scanner.nextInt();//排名前m的学生
        Student[] students = new Student[n];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].name = scanner.next();
            students[i].id = scanner.next();
            students[i].gpa = scanner.nextDouble();
            students[i].mark = scanner.nextDouble();
            students[i].school = scanner.next();
        }
        //按照gpa进行排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o2.gpa - o1.gpa < 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        //打印gpa前m个的学校名称
        for (int i = 0; i < m; i++) {
            System.out.print(students[i].school + " ");
        }
        System.out.println();
        System.out.println();
        //按照加分进行排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o2.mark - o1.mark < 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        //打印gpa前m个的学校名称
        for (int i = 0; i < m; i++) {
            System.out.print(students[i].id + " ");
        }
        System.out.println();
        System.out.println();
        //按照gpa+加分进行排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if ((o2.mark + o2.gpa) - (o1.gpa + o1.mark) < 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        //打印gpa前m个的学校名称
        for (int i = 0; i < m; i++) {
            System.out.print(students[i].name + " ");
        }
    }

}

class Student {
    String name;//名字
    String id;//学号
    double gpa;//GPA
    double mark;//分
    String school;//学校名称
}
