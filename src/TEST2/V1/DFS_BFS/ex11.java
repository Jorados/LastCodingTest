package TEST2.V1.DFS_BFS;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 미로 최단거리 - BFS

class Edge{
    int x;
    int y;
    public Edge(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class ex11 {

    static int[][] map;
    static int[][] dis;
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};

    public static void BFS(int x,int y){
        Queue<Edge> Q = new LinkedList<>();
        Q.offer(new Edge(x,y));
        map[x][y]=1;

        while (!Q.isEmpty()){
            Edge poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<7 && ny>=0 && ny<7 && map[nx][ny]==0){
                    map[nx][ny]=1;
                    Q.offer(new Edge(nx,ny));
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new int[7][7];
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                map[i][j] =sc.nextInt();
            }
        }
        dis = new int[7][7];
        BFS(0,0);
        if(dis[6][6]==0) System.out.println(-1);
        else System.out.println(dis[6][6]);
    }
}
