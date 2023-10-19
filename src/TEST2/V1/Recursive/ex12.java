package TEST2.V1.Recursive;


import java.util.*;

// 그래프 최단거리 (인접 리스트) - BFS
public class ex12 {

    static int n;
    static int m;
    static boolean[] ch;
    static int[] dis;

    static ArrayList<ArrayList<Integer>> graph;
    public static void DFS(int v){
        ch[v]=true;
        dis[v]=0;
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        while (!Q.isEmpty()){
            int poll = Q.poll();
            for(int nx : graph.get(poll)){
                if(!ch[nx]){
                    ch[nx]=true;
                    Q.offer(nx);
                    dis[nx] = dis[poll] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        ch = new boolean[n+1];
        dis = new int[n+1];
        graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b); // 단방향
        }

        ch[1]=true;
        dis[1]=0;
        DFS(1);
        for(int i=2; i<=n; i++){
            System.out.println(i+" : "+dis[i]);
        }
    }
}
