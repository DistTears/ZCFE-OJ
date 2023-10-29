import java.util.Scanner;
public class Main1 {
    static int n,k,ans;
    static int[][] map;
    static boolean[] vis;
    static void dfs(int row,int idx) {//row行，已经放了idx个
        if(idx == k) {ans++;return;}
        for(int i = row;i < n;i++) //行
            for(int j = 0;j < n;j++) //列
                if(map[i][j] == 0 && !vis[j]) {
                    vis[j] = true;
                    dfs(i + 1,idx + 1);
                    vis[j] = false;
                }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            ans = 0;
            n = cin.nextInt();
            k = cin.nextInt();
            if(n == -1 && k == -1)
                break;
            String tmp;
            map = new int[n][n];
            vis = new boolean[n];
            for(int i = 0;i < n;i++) {
                tmp = cin.next();
                for(int j = 0;j < n;j++)
                    if(tmp.charAt(j) == '#')
                        map[i][j] = 0;
                    else
                        map[i][j] = 1;
            }
            dfs(0,0);
            System.out.println(ans);
        }
    }
}