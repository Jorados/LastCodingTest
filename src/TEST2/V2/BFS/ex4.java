package TEST2.V2.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/// 미로의 최단거리 통로
class Edge{
    int x;
    int y;
    public Edge(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class ex4 {
    static int n,answer=Integer.MAX_VALUE;
    static int[][] map;
    static boolean[][] ch;
    static int[][] dis;

    static int[] dx ={0,1,0,-1};
    static int[] dy ={1,0,-1,0};
    public static void BFS(int x,int y){
        ch[x][y]=true;
        Queue<Edge> Q = new LinkedList<>();
        Q.offer(new Edge(x,y));

        while (!Q.isEmpty()){
            Edge poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && map[nx][ny]==0 && !ch[nx][ny]){
                    ch[nx][ny]=true;
                    Q.offer(new Edge(nx,ny));
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        map = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                map[i][j] = sc.nextInt();
            }
        }

        ch = new boolean[n][n];
        dis = new int[n][n];
        BFS(0,0);

        if(dis[6][6]==0) System.out.println(-1);
        else System.out.println(dis[6][6]);
    }
}
