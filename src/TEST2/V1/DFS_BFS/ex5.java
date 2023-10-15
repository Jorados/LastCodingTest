package TEST2.V1.DFS_BFS;


import java.util.Scanner;

// 동전교환 - DFS
public class ex5 {

    static int n,answer = Integer.MAX_VALUE;
    static int[] arr;
    static int money; // 거슬러 줘야할 돈.

    public static void DFS(int sum, int L){
        if(sum == money){
            answer = Math.min(answer,L);
        }
        if(sum>money){
            return;
        }

        for(int i=0; i<arr.length; i++){
            DFS(sum+arr[i],L+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        money = sc.nextInt();
        DFS(0,0);
        System.out.println(answer);
    }
}
