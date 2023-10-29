import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-25
 * Time: 23:29
 */
/*
 * 123565321 、 145541
 * ------------------------
 * 2022,2022222022
 * */
public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2022; i <= 2022222022; i++) {
            if (fun1(i) && fun2(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean fun1(int num) {
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder(s);
        if (sb.reverse().toString().equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean fun2(int num) {
        String s = Integer.toString(num);
        String sub = s.substring(s.length() / 2);
        int[] arr = new int[sub.length()];
        for (int i = 0; i < sub.length(); i++) {
            arr[i] = Character.valueOf(sub.charAt(i));
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
