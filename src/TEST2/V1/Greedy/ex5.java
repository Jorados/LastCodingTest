package TEST2.V1.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// 다익스트라 알고리즘
class Edge{
    int v;
    int cost;
    public Edge(int v, int cost){
        this.v = v;
        this.cost = cost;
    }
}
public class ex5 {
    static int n;
    static int m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;
    public static void BFS(int v){
        dis[1]=0;

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(v,0)); // 정점 , 비용

        while (!pq.isEmpty()){
            Edge poll = pq.poll();
            int now = poll.v;
            int nowCost = poll.cost;

            if(nowCost > dis[now]){
                continue;
            }

            for(Edge ob : graph.get(now)){
                if(nowCost + ob.cost < dis[ob.v]){
                    dis[ob.v] = nowCost + ob.cost;
                    pq.offer(new Edge(ob.v , nowCost+ ob.cost));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        m = sc.nextInt();
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b,c));
        }

        dis = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        BFS(1);
    }
}
