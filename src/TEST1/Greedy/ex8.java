package TEST1.Greedy;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

//원더랜드(최소스패닝트리 : 프림, PriorintyQueue) //인접리스트 외워..
//자주보고 자주쳐봐야 손에 익을듯
class Edge3 implements Comparable<Edge3>{
    public int vex;
    public int cost;
    Edge3(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge3 ob){
        return this.cost-ob.cost;
    }
}
public class ex8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<ArrayList<Edge3>> graph = new ArrayList<ArrayList<Edge3>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Edge3>());
        }
        int[] ch = new int[n+1];
        for(int i=0; i<m; i++){
           int v1=sc.nextInt();
           int v2=sc.nextInt();
           int cost=sc.nextInt();
           //방향그래프면 한방향만 넣으면되는데, 양방향이라서 두방향 다.
           graph.get(v1).add(new Edge3(v2,cost));
           graph.get(v2).add(new Edge3(v1,cost));
        }

        //프림알고리즘(우선순위 큐)
        int answer=0;
        PriorityQueue<Edge3> pQ = new PriorityQueue<>();
        pQ.offer(new Edge3(1,0));
        while (!pQ.isEmpty()){
            Edge3 tmp = pQ.poll();
            int ev = tmp.vex;
            //회로면안되고, 트리형태를 만들기 위해서 ch[] 체크배열로 if문
            if(ch[ev]==0){
                ch[ev]=1;
                answer+=tmp.cost;
                for(Edge3 ob : graph.get(ev)){
                    //이미 체크된 간선 빼고
                    if(ch[ob.vex]==0) pQ.offer(new Edge3(ob.vex,ob.cost));
                }
            }
        }
        System.out.println(answer);
    }
}
