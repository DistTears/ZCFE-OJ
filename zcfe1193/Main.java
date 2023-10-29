import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        PriorityQueue<Long> priorityQueue=new PriorityQueue<Long>();
        String[] s=br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            priorityQueue.add(Long.parseLong(s[i]));
        }

        long sum=0;
        while(priorityQueue.size()>1) {
            long a=priorityQueue.poll();
            long b=priorityQueue.poll();
            sum+=a+b;
            priorityQueue.add(a+b);
        }
        System.out.println(sum);
    }

}