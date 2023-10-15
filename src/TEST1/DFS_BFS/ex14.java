package TEST1.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//섬나라 아일랜드 푸는방법
//1.solution함수에서 돌리다가 1만나면 DFS,BFS함수 호출
//2.DFS,BFS함수에서 8방향으로 돌려서 if문에 해당하면 다 돌면서 0으로 만들버리고 더 이상 없으면 종료.
//3.다시 solution에서 돌리면서 탐색.
//BFS
public class ex14 {
    static int answer=0, n;
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
    static Queue<Point> Q = new LinkedList<>();
    public static void BFS(int x, int y, int[][] board){
        Q.offer(new Point(x, y));
        while(!Q.isEmpty()){
            Point pos = Q.poll();
            for(int i=0; i<8; i++){
                int nx=pos.x+dx[i];
                int ny=pos.y+dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                    board[nx][ny]=0;
                    Q.add(new Point(nx, ny));
                }
            }
        }
    }
     public static void solution(int[][] board){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    answer++;
                    board[i][j]=0;
                    BFS(i, j, board);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] board=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=sc.nextInt();
            }
        }
        solution(board);
        System.out.println(answer);
    }
}
