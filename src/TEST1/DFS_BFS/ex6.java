package TEST1.DFS_BFS;


import java.util.Scanner;

//순열 구하기
public class ex6 {
    static int n,m;
    static int[] answer;
    static int[] ch;

    public static void DFS(int L,int[] num){
        if(L==m) {
            for(int x : answer) System.out.print(x + " ");
            System.out.println();
        }
        else{
            for(int i=0; i<n; i++){
                if(ch[i]==0){
                    ch[i]=1;
                    answer[L]=num[i];
                    DFS(L+1,num);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        answer = new int[m];
        ch = new int[n];
        DFS(0,num);
    }
}
