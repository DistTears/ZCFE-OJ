import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-18
 * Time: 23:07
 */
/*
5
IN xiaoming N
IN Adel V
IN laozhao N
OUT N
IN CLZ V

--------
Adel
CLZ
laozhao
* */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//操作次数
        scanner.nextLine();
        LinkedList<String> vipQueue = new LinkedList<>();//vip窗口
        LinkedList<String> queue = new LinkedList<>();//普通窗口
        for (int i = 1; i <= n; i++) {
            String s = scanner.nextLine();
            String[] strs = s.split(" ");//空格作为分界线
            if(strs[0].equals("IN")){//如果是进队列
                if(strs[2].equals("V")){//是vip用户就进入vip窗口
                    vipQueue.offer(strs[1]);
                }else{//是普通用户就进入普通窗口
                    queue.offer(strs[1]);
                }
            }else{//如果是出，
                if(strs[1].equals("V")){
                    vipQueue.poll();
                }else{
                    queue.poll();
                }

            }
        }
        for(String vip:vipQueue){
            System.out.println(vip);
        }
        for(String s:queue){
            System.out.println(s);
        }
    }
}
