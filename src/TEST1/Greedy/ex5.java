package TEST1.Greedy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
        public int vex; //정점
        public int cost; //가중치 값
        Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge ob){
            return this.cost-ob.cost; //가중치 값기준으로 오름차순
        }
    }

public class ex5 {
        static int n, m;
        static ArrayList<ArrayList<Edge>> graph;
        static int[] dis;
        public static void solution(int v){
            PriorityQueue<Edge> pQ = new PriorityQueue<>();
            pQ.offer(new Edge(v, 0));
            dis[v]=0;
            while(!pQ.isEmpty()){
                Edge tmp=pQ.poll(); //가장 비용이 작은 값
                int now=tmp.vex;
                int nowCost=tmp.cost;

                //나중에 poll하는 nowCost가 기존 dis[now]보다 크면 forEach x
                if(nowCost>dis[now]) continue;
                //핵심
                for(Edge x : graph.get(now)){
                    if(dis[x.vex]>nowCost+x.cost){
                        dis[x.vex]=nowCost+x.cost;
                        pQ.offer(new Edge(x.vex, nowCost+x.cost));
                    }
                }
            }
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
            m=sc.nextInt();
            graph = new ArrayList<ArrayList<Edge>>();
            for(int i=0; i<=n; i++){
                graph.add(new ArrayList<Edge>());
            }
            dis=new int[n+1];
            Arrays.fill(dis, Integer.MAX_VALUE); //매우 큰값으로 기본값 세팅
            for(int i=0; i<m; i++){
                int a=sc.nextInt(); //a에서
                int b=sc.nextInt(); //b로
                int c=sc.nextInt(); //가중치 값
                graph.get(a).add(new Edge(b, c));
            }
            solution(1);
            for(int i=2; i<=n; i++){
                if(dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
                else System.out.println(i+" : impossible");
            }
        }
}
