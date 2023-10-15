package TEST1.DFS_BFS;

import java.util.Scanner;

//조합의 경우의 수(메모이제이션)
public class ex7 {
    //일반 방식
//    public static int DFS(int n, int r){
//        if(r==0 || n==r) return 1;
//        else {
//            return DFS(n-1,r-1) + DFS(n-1,r);
//        }
//    }

    //메모이제이션
    static int[][] ch = new int[35][35];
    public static int DFS(int n, int r){
        if(ch[n][r]>0) return ch[n][r];
        if(r==0 || n==r) return 1;
        else {
            return ch[n][r] = DFS(n-1,r-1) + DFS(n-1,r);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(DFS(n,r));
    }
}
