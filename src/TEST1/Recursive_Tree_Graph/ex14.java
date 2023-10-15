package TEST1.Recursive_Tree_Graph;
import java.util.*;
public class ex14 {
    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;
    public static void BFS(int v){
        ch[v]=1;
        dis[v]=0;
        Queue<Integer> Q=new LinkedList<>();
        Q.offer(v);
        while(!Q.isEmpty()){
            int x=Q.poll();
            for(int nx : graph.get(x)){
                if(ch[nx]==0){
                    ch[nx]=1;
                    Q.offer(nx);
                    dis[nx]=dis[x]+1;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();

        graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){ //밑에 get(a)으로 1~6까지만 사용할거임 //get(0)부터 시작해서 그럼.우리는 get(1)부터 쓸거임
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        dis=new int[n+1];
        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph.get(a).add(b);
        }
        BFS(1);
        for(int i=2; i<=n; i++){
            System.out.println(i+" : "+dis[i]);
        }
    }
}
