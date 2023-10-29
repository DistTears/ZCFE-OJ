import java.util.*;

class Course {
    String name;//课程名
    int hours;//课程时长
    int preReqCount;//依赖个数

    Course(String name, int hours) {
        this.name = name;
        this.hours = hours;
        this.preReqCount = 0;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 课程数
        int M = scanner.nextInt(); // 依赖关系数
        int K = scanner.nextInt(); // 计划选修课数

        Map<String, Course> courseMap = new HashMap<>();//键存储课程名，值存储课程类
        List<Course> availableCourses = new ArrayList<>();//集合

        for (int i = 0; i < N; i++) {
            String name = scanner.next();//输入课程名
            int hours = scanner.nextInt();//输入课程学时
            Course course = new Course(name, hours);
            courseMap.put(name, course);//存储map集合
            availableCourses.add(course);//课程类存储list集合
        }

        for (int i = 0; i < M; i++) {
            String prereq = scanner.next();//被依赖的课程
            String courseName = scanner.next();//依赖的课程
            Course prereqCourse = courseMap.get(prereq);//根据被依赖的课程名，获取其课程类
            Course course = courseMap.get(courseName);//根据依赖的课程获取课程类
            course.preReqCount++;//
        }

        List<Course> selectedCourses = new ArrayList<>();
        int totalHours = 0;

        while (selectedCourses.size() < K) {
            Course minHoursCourse = null;
            for (Course course : availableCourses) {
                if (course.preReqCount == 0) {
                    if (minHoursCourse == null || course.hours < minHoursCourse.hours) {
                        minHoursCourse = course;
                    }
                }
            }

            if (minHoursCourse == null) {
                break;
            }

            totalHours += minHoursCourse.hours;
            selectedCourses.add(minHoursCourse);
            availableCourses.remove(minHoursCourse);

            for (Course course : availableCourses) {
                if (course.preReqCount > 0) {
                    course.preReqCount--;
                }
            }
        }

        System.out.println(totalHours);
    }
}
