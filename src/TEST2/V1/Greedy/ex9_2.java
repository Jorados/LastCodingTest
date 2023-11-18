package TEST2.V1.Greedy;


import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

// 최소 스패닝 트리
public class ex9_2 {
    static int n,m;
    static ArrayList<ArrayList<Point>> graph;
    static boolean[] ch;
    static int answer=0;
    public static void solution(){
        PriorityQueue<Point> pq = new PriorityQueue<>();
        pq.offer(new Point(1,0));

        while (!pq.isEmpty()){
            Point poll = pq.poll();

            if(!ch[poll.v]){
                ch[poll.v]=true;
                answer += poll.cost;
                for(Point nv : graph.get(poll.v)){
                    if(!ch[nv.v]) pq.offer(new Point(nv.v,nv.cost));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        m = sc.nextInt();
        ch = new boolean[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Point(b,c));
            graph.get(b).add(new Point(a,c));
        }
        // 최소스패닝
        solution();
        System.out.println(answer);
    }
}
