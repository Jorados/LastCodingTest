package TEST2.V1.DFS_BFS;


import java.util.Scanner;

// 중복 순열 구하기
public class ex4 {

    static int n;
    static int m;
    static int[] answer;

    public static void DFS(int L){
        if(L==m){
            for(int x : answer){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else{
            for(int i=1; i<=n; i++){
                answer[L]=i;
                DFS(L+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        answer = new int[m];
        DFS(0);
    }
}
