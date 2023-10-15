package TEST1.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//원더랜드(최소스패닝트리 : 크루스칼, Union&Find 활용)
//자주보고 자주쳐봐야 손에 익을듯
class Edge2 implements  Comparable<Edge2>{
    int v1;
    int v2;
    int cost;

    public Edge2(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge2 o) {
        return this.cost-o.cost;
    }
}
public class ex7 {
    static int[] unf;

    //집합으로 연결된 최댓값 찾음
    public static int Find(int v){
        if(v==unf[v]) return v;
        else return unf[v]=Find(unf[v]);
    }

    //각 f(a),f(b)의 값을 찾아서 다르면 집합으로 연결.
    public static void Union(int a, int b){
        int fa=Find(a);
        int fb=Find(b);
        if(fa!=fb) unf[fa]=fb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n+1];
        ArrayList<Edge2> arr =new ArrayList<>();
        for(int i=1; i<=n; i++) unf[i]=i;
        for(int i=0; i<m; i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            int cost=sc.nextInt();
            arr.add(new Edge2(v1,v2,cost));
        }

        //크루스칼 로직 --> 순환이 되면안됨. 트리형태가 되어야함.
        int answer=0;
        Collections.sort(arr);
        for(Edge2 ob : arr){
            int fv1=Find(ob.v1);
            int fv2=Find(ob.v2);
            if(fv1!=fv2){
                answer+=ob.cost;
                Union(ob.v1,ob.v2);
            }
        }
        System.out.println(answer);
    }
}
