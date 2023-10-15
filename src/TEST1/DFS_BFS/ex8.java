package TEST1.DFS_BFS;

import java.util.Scanner;

//순열 예측하기 = 조합 경우의 수 + 순열 구하기
public class ex8 {
    static boolean flag=false;
    static int n=0,f=0;
    static int[] b,p,ch;
    static int[][] dy = new int[35][35]; //combi 체크배열
    public static int combi(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        if(r==0 || n==r) return 1;
        else {
            return dy[n][r] = combi(n-1,r-1) + combi(n-1,r);
        }
    }

    public static void DFS(int L,int sum){
        if(flag) return;
        if(L==n){
            if(sum==f){
                for(int x : p) System.out.print(x + " ");
                flag=true;
            }
        }else{
            for(int i=1; i<=n; i++){
                if(ch[i]==0){
                    ch[i]=1;
                    p[L]=i;
                    DFS(L+1, sum+(p[L]*b[L]));
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n+1];
        for(int i=0; i<n; i++){
            b[i] = combi(n-1,i);
        }
        DFS(0,0);
    }
}
