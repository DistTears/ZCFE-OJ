import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        int h,r,n;
        double PI = 3.14159,V,D;
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();  //获取小圆桶的深度
        r = sc.nextInt(); //获取底面半径r
        V = PI*r*r*h;  //求出一桶水的体积
        int m = 20000; //大象要喝的水
        D = Math.ceil((double)m/V);  //向上取整
        n = (int)D;  //将double类型强转化为int类型
        System.out.println(n);
    }
}
