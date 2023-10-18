package TEST2.V1.DFS_BFS;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 섬나라 아일랜드 BFS


class Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class ex13_BFS {
    static int n;
    static int[][] map;
    static int answer=0;
    static int[] dx = {0,1,1,1,0,-1,-1,-1};
    static int[] dy = {1,1,0,-1,-1,-1,0,1};

    public static void BFS(int x,int y,boolean[][] ch){
        map[x][y]=0;
        ch[x][y]=true;
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x,y));

        while (!Q.isEmpty()){
            Point poll = Q.poll();
            for(int i=0; i<8; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && !ch[nx][ny] && map[nx][ny]==1){
                    map[nx][ny]=0;
                    ch[nx][ny]=true;
                    Q.offer(new Point(nx,ny));
                }
            }

        }
    }
    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j] == 1){
                    boolean[][] ch = new boolean[n][n];
                    answer++;
                    BFS(i,j,ch);
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

        solution();
        System.out.println(answer);
    }
}
