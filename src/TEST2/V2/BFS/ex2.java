package TEST2.V2.BFS;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 집으로 이동
public class ex2 {

    static int n;
    static int[] pool;
    static int a,b,home,answer=0;
    static boolean[] ch = new boolean[10001];
    public static int BFS(int v){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        int L=0;
        ch[v]=true;

        while (!Q.isEmpty()){
            int size = Q.size();
            for(int i=0; i<size; i++){
                Integer poll = Q.poll();
                for(int nx : new int[] {poll+a,poll-b}){
                    if(nx==home) return L+1;
                    if(nx>=0 && nx<10001 && !ch[nx]){
                        ch[nx] = true;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pool = new int[n];
        for(int i=0; i<n; i++){
            pool[i] = sc.nextInt();
        }

        a = sc.nextInt();
        b = sc.nextInt();
        home = sc.nextInt();

        System.out.println(BFS(0));

    }
}
