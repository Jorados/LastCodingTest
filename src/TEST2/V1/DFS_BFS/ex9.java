package TEST2.V1.DFS_BFS;


import java.util.Scanner;

// 조합 구하기
public class ex9 {

    static int n;
    static int m;

    static int[] answer;
    public static void DFS(int L,int s){
        if(L==m){
            for(int x : answer){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else{
            for(int i=s; i<=n; i++){
                answer[L]=i;
                DFS(L+1,s+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        answer = new int[m];
        DFS(0,1);
    }
}
