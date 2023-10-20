package TEST2.V1.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// 다익스트라 연습
public class ex5_2 {
    static int n,m;
    static int[] dis;
    static ArrayList<ArrayList<Edge>> graph;

    public static void solution(){
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(1,0));
        dis[1]=0;
        while (!pq.isEmpty()){
            Edge poll = pq.poll();
            int now = poll.v;
            int nowCost = poll.cost;

            if(nowCost > dis[now]){
                continue;
            }

            for(Edge x : graph.get(now)){
                if(x.cost + nowCost < dis[x.v]){
                    dis[x.v] = x.cost + nowCost;
                    pq.offer(new Edge(x.v,x.cost+nowCost));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        m = sc.nextInt();
        dis = new int[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b =  sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b,c)); //단방향
        }
        Arrays.fill(dis,Integer.MAX_VALUE);
        solution();

        for(int i=2; i<=n; i++){
            if(dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
            else System.out.println(i+" : impossible");
        }
    }
}
