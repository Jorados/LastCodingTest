package TEST1.DFS_BFS;

import java.util.Scanner;
//섬나라 아일랜드 푸는방법
//1.solution함수에서 돌리다가 1만나면 DFS,BFS함수 호출
//2.DFS,BFS함수에서 8방향으로 돌려서 if문에 해당하면 다 돌면서 0으로 만들버리고 더 이상 없으면 종료.
//3.다시 solution에서 돌리면서 탐색.
//DFS
public class ex13 {
    static int answer=0,n=0;
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
    public static void DFS(int x,int y,int[][] board){
        for(int i=0; i<8; i++){ //8방향
            int nx= x+dx[i];
            int ny= y+dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                board[nx][ny]=0;
                DFS(nx,ny,board);
            }
        }
    }
    public static void solution(int[][] board){
        //board를 돌면서 섬을 찾아다닌다. 여기서 DFS가 들린곳은 0으로 만들어준다.
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    answer++;
                    //DFS에서 주변 8방향 들린곳을 0으로 만들어 줌.
                    DFS(i,j,board);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[][] board =  new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=sc.nextInt();
            }
        }
        solution(board);
        System.out.println(answer);
    }
}
