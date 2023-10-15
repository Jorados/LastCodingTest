package TEST2.V1.DFS_BFS;


import java.util.Scanner;

// 바둑이 승차 - DFS
public class ex2 {

    static boolean[] ch;
    static int c;
    static int n;
    static int[] arr;
    static int answer=Integer.MIN_VALUE;
    public static void DFS(int num){
        if(num > c){
            return;
        }
        if(num <= c){
            answer = Math.max(answer,num);
        }

        for(int i=0; i<n; i++){
            if(!ch[i]){
                ch[i]=true;
                DFS(num+arr[i]);
                ch[i]=false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ch = new boolean[n];
        DFS(0);
        System.out.println(answer);
    }
}
