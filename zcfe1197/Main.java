import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-16
 * Time: 22:25
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].china = scanner.nextInt();
            students[i].math = scanner.nextInt();
            students[i].english = scanner.nextInt();
            students[i].id = i + 1;
        }
        Arrays.sort(students, (o1, o2) -> {
            int i = (o2.china + o2.english + o2.math) - (o1.china + o1.english + o1.math);
            i = i == 0 ? (o2.china - o1.china) : i;
            i = i == 0 ? o1.id - o2.id : i;
            return i;

        });
        int i = 0;
        for (Student student : students) {
            i++;
            if(i == 6){
                break;
            }
            System.out.println(student.id + " " + (student.china + student.math + student.english));

        }
    }
}

class Student {
    int id;
    int china;
    int math;
    int english;
}
