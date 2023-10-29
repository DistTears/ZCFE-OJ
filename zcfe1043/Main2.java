
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main2 {
    static List<int[]> lis = new ArrayList<int[]>();
    // 输出所有组合
    public static void print(){
        for(int[] x:lis){
            for(int y:x){
                System.out.print(y);
            }
            System.out.println();
        }
    }
   /* // 检测是否有重复元素
    public static boolean check2(int[] n){
        if(lis.size()==0) return false;
        for(int i=0;i<lis.size();i++){
            int a = n[0]*100+n[1]*10+n[2];
            int b = lis.get(i)[3]*100+lis.get(i)[4]*10+lis.get(i)[5];
            if(a!=b){
                return false;
            }
        }
        return true;
    }*/
    // 检测,并添加符合的组合
    public static void check(int[] n){
        int a = n[0]*100+n[1]*10+n[2];
        int b = n[3]*100+n[4]*10+n[5];
        int c = n[6]*100+n[7]*10+n[8];
        if(a+b==c){
                lis.add(Arrays.copyOf(n, n.length));
        }
    }
    // 全排列
    public static void f(int[] n,int start,int end){
        if(start>=end){
            check(n);	// 检测,并添加符合的组合
            return ;
        }else{
            for(int i=start;i<n.length;i++){
                int temp = n[start];
                n[start] = n[i];
                n[i] = temp;
                f(n,start+1,end);
                temp = n[start];
                n[start] = n[i];
                n[i] = temp;
            }
        }
    }
    public static void main(String[] args){
        int[] n = {1,2,3,4,5,6,7,8,9};
        f(n,0,n.length-1);
        print();	// 输出结果
        System.out.println("总个数:"+lis.size());	// 输出个数
    }
}
