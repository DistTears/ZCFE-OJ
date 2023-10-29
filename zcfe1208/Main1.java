import java.util.Scanner;

public class Main1 {
    private static int[] arr;

    private static int maxnum;
    static     int num;//总层数
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();//一共n个结点
        //一共有 i层，每层有 2的i-1次方个

        arr=new int[n+1];
        for (int i = 1; i <=n; i++) {
            arr[i]=scanner.nextInt();
        }

        for (int i = 1; i <n; i++) {
            if (Math.pow(2, i)-1==n) {
                num=i;
            }
        }

        for (int i = 1; i <=num; i++) {//求1~num层的值
            maxnum=(int)Math.max(maxnum, sum(i));
        }
        for (int i = 1; i <=Math.pow(2, i-1); i++) {
            if (sum(i)==maxnum) {
                System.out.println(i);
                break;
            }
        }
    }
    public static int sum(int i) {
        // TODO 自动生成的方法存根
        int sum = 0;
        for ( int j=(int)Math.pow(2, i-1); j < 2*(int)Math.pow(2, i-1); j++) {
            //第2层下标4到7
            sum+=arr[j];
        }
        return sum;
    }
}

