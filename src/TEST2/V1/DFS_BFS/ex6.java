package TEST2.V1.DFS_BFS;


import java.util.Scanner;

// 순열 구하기
public class ex6 {
    static int n;
    static int m;
    static int[] arr;
    static boolean[] ch;
    static int[] answer;
    public static void DFS(int L){
        if(L==m){
            for(int x : answer){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        else{
            for(int i=0; i<n; i++){
                if(!ch[i]){
                    ch[i]=true;
                    answer[L]=arr[i];
                    DFS(L+1);
                    ch[i]=false;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ch = new boolean[n];
        answer = new int[m];
        DFS(0);
    }
}
