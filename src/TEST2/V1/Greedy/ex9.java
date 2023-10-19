package TEST2.V1.Greedy;


import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

// 원더랜드 - 최소비용
class Point implements Comparable<Point>{
    int v;
    int cost;
    public Point(int v, int cost){
        this.v = v;
        this.cost = cost;
    }
    @Override
    public int compareTo(Point o){
        return this.cost - o.cost;
    }
}
public class ex9 {
    static int v;
    static int e;
    static ArrayList<ArrayList<Point>> graph;
    static boolean[] ch;
    static int answer=0;

    public static void BFS(){
        PriorityQueue<Point> pq = new PriorityQueue<>();
        pq.offer(new Point(1,0));

        while (!pq.isEmpty()){
            Point poll = pq.poll();

            if(!ch[poll.v]){
                ch[poll.v] = true;
                answer += poll.cost;
                for(Point nv : graph.get(poll.v)){
                    if(!ch[nv.v]) pq.offer(new Point(nv.v,nv.cost));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        v = sc.nextInt();
        graph = new ArrayList<>();
        for(int i=0; i<=v; i++){
            graph.add(new ArrayList<>());
        }

        e = sc.nextInt();
        for(int i=0; i<e; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            graph.get(a).add(new Point(b,c)); //양방향그래프
            graph.get(b).add(new Point(a,c));
        }

        ch = new boolean[v+1];
        BFS();
        System.out.println(answer);
    }
}
