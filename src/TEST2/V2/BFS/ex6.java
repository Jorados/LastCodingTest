package TEST2.V2.BFS;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 숲속의 기사
// 내가 볼땐 각각의 딸기좌표에서 기사를 찾는 거로 해야함.
class Dot{
    int x;
    int y;
    public Dot(int x,int y){
        this.x =x;
        this.y=y;
    }
}
public class ex6 {
    static int n,m;
    static int[][] map;
    static boolean[][] ch;
    static int sX,sY;
    static int answer=Integer.MAX_VALUE;
    static int[] dx ={0,1,0,-1};
    static int[] dy ={1,0,-1,0};
    static int[][] dis;
    static boolean[][] ch2;
    static int[][] dis2;
    public static void BFS(int sX,int sY){
        Queue<Dot> Q = new LinkedList<>();
        Q.offer(new Dot(sX,sY));
        ch[sX][sY]=true;

        while (!Q.isEmpty()){
            Dot poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && !ch[nx][ny] && map[nx][ny]!=1){
                    ch[nx][ny]=true;
                    Q.offer(new Dot(nx,ny));
                    dis[nx][ny] = dis[poll.x][poll.y] +1;
                }
            }
        }
    }

    public static void solution(){
        for(int i=0; i<n; i++){
            int cnt=0;
            for(int j=0; j<m; j++){
                if(map[i][j]==4){
                    cnt+=dis[i][j];
                    //System.out.println(cnt);
                    cnt+=BFS2(i,j);
                    //System.out.println(cnt);
                    answer = Math.min(answer,cnt);
                }
                cnt=0;
            }
        }
    }

    public static int BFS2(int x,int y){
        int[][] dis2 = new int[n][m];
        boolean[][] ch2 = new boolean[n][m];

        Queue<Dot> Q = new LinkedList<>();
        Q.offer(new Dot(x,y));
        ch2[x][y]=true;

        while (!Q.isEmpty()){
            Dot poll = Q.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && !ch2[nx][ny] && map[nx][ny]!=1){
                    ch2[nx][ny]=true;
                    Q.offer(new Dot(nx,ny));
                    dis2[nx][ny] = dis2[poll.x][poll.y] +1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]==3){
                    return dis2[i][j];
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j]=sc.nextInt();
                if(map[i][j]==2){
                    sX = i;
                    sY = j;
                }
            }
        }
        ch = new boolean[n][m];
        dis = new int[n][m];
        ch2 = new boolean[n][m];
        dis2 = new int[n][m];

        BFS(sX,sY);
        solution();
        System.out.println(answer);
    }
}
