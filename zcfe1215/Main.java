import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a * b];            //最大不能买到的数量一定小于a*b
        for (int i = 0; i <= b; i++) {
            for (int j = 0; j <= a; j++) {            //a*i的值    a*i的值能够组成b*j的值
                if (a * i + b * j < a * b) {            //b*j的值能够组成  	a*i+b*j也能够组成
                    arr[a * i + b * j]++;            //将能表示的数对应下标的元素加 1
                }                            //这样0的下标为不能用a*i+b*j的数
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {                    //第一个为0的数元素的下标
                System.out.print(i);
                break;
            }
        }
    }
}