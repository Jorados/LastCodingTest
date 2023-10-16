package TEST2.V1.DFS_BFS;


import java.util.Scanner;

// 미로탐색
public class ex10 {

    static int[][] map;
    static boolean[][] ch;
    static int answer=0;
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    public static void DFS(int x,int y){
        if(x==6 && y==6){
            answer++;
        }

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<7 && ny>=0 && ny<7 && !ch[nx][ny] && map[nx][ny]==0){
                ch[nx][ny]=true;
                DFS(nx,ny);
                ch[nx][ny]=false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new int[7][7];
        ch = new boolean[7][7];

        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                map[i][j] = sc.nextInt();
            }
        }

        ch[0][0]=true;
        DFS(0,0);
        System.out.println(answer);
    }
}
