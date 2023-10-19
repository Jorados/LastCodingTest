package TEST2.V1.Recursive;


import java.util.ArrayList;
import java.util.Scanner;

// 경로 탐색 - 인접리스트
public class ex11 {
    static int n; // 정점
    static int m; // 간선 수
    static ArrayList<ArrayList<Integer>> graph;
    static int answer;
    static boolean[] ch;
    public static void DFS(int v){
        if(v==n){
            answer++;
        }
        else{
            for(int nx : graph.get(v)){
                if(!ch[nx]){
                    ch[nx]=true;
                    DFS(nx);
                    ch[nx]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList<>();
        ch = new boolean[n+1];
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
        }

        ch[1]=true;
        DFS(1);
        System.out.println(answer);
    }
}
