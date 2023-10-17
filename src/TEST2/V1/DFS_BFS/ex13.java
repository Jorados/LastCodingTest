package TEST2.V1.DFS_BFS;


import java.util.Scanner;

// 섬나라 아일랜드 - DFS
public class ex13 {

    static int n;
    static int[][] map;
    static int answer=0;
    static int[] dx = {0,1,1,1,0,-1,-1,-1};
    static int[] dy = {1,1,0,-1,-1,-1,0,1};
    public static void DFS(int x,int y){
        map[x][y]=0;
        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && map[nx][ny]==1){
                map[nx][ny]=0;
                DFS(nx,ny);
            }
        }
    }
    public static void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1){
                    answer++;
                    DFS(i,j);
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
                map[i][j]=sc.nextInt();
            }
        }

        solution();
        System.out.println(answer);
    }
}
