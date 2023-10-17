package TEST2.V1.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 익지 않은 토마토 - BFS
public class ex12 {

    // solution()으로 탐색한다.
    // dis[][]에 Math.min 을 저장.

    static int n,m,answer=Integer.MIN_VALUE;
    static int[][] map;
    static int[][] dis;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void BFS(int x,int y,boolean[][] ch){
        ch[x][y]=true;
        Queue<Edge> Q = new LinkedList<>();
        Q.offer(new Edge(x,y));

        while(!Q.isEmpty()){
            Edge poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<m && ny>=0 && ny<n && !ch[nx][ny] && map[nx][ny]==0){
                    ch[nx][ny]=true;
                    Q.offer(new Edge(nx,ny));
                    if(dis[nx][ny]!=0) dis[nx][ny] = Math.min(dis[nx][ny],dis[poll.x][poll.y]+1);
                    else dis[nx][ny] = dis[poll.x][poll.y]+1;
                }
            }
        }
    }
    public static void solution(){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1){
                    boolean[][] ch = new boolean[m][n];
                    BFS(i,j,ch);
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                answer = Math.max(answer,dis[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                map[i][j] = sc.nextInt();
            }
        }
        dis = new int[m][n];

        solution();
        System.out.println(answer);
    }
}
