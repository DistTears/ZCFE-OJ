import java.util.ArrayList;
import java.util.Scanner;

/**
* Created with IntelliJ IDEA.
* Description:
* User: 陈磊
* Date: 2023-10-15
* Time: 18:34
*/
/*
5 5
2 1 2
1 1 3
2 1 3
1 2 3
2 1 2
NO
YES
YES
* */
class student{
    int is;//1则两个是朋友 2是判断两个是朋友
    int f1;//学生1
    int f2;//学生2
        }
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        int n = scanner.nextInt();//学生的个数
        int m = scanner.nextInt();//组数
        student[] students = new student[m];
        ArrayList<String> strs = new ArrayList<>();//存放YES和NO
        StringBuilder s = new StringBuilder();//用于组成朋友关系
        for(int i = 0;i<m;i++){
            students[i] = new student();
            students[i].is = scanner.nextInt();
            students[i].f1 = scanner.nextInt();
            students[i].f2 = scanner.nextInt();
            if(students[i].is == 1){
                s.append(students[i].f1);
                s.append(students[i].f2);
            }else{
                if(s.toString().contains(Integer.toString(students[i].f1))&&s.toString().contains(Integer.toString(students[i].f2))){
                    strs.add("YES");
                }else{
                    strs.add("NO");
                }
            }
        }
        for (String str : strs) {
            System.out.println(str);
        }
    }
}
