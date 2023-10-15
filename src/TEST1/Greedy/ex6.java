package TEST1.Greedy;

import java.util.Scanner;

//친구인가? (Disjoint-Set(서로소집합) : Union&Find)
public class ex6 {
    static int[] unf;

    //집합으로 연결된 최댓값 찾음
    public static int Find(int v){
        if(v==unf[v]) return v;
        else return unf[v]=Find(unf[v]);
    }

    //각 f(a),f(b)의 값을 찾아서 다르면 연결.
    public static void Union(int a, int b){
        int fa=Find(a);
        int fb=Find(b);
        if(fa!=fb) unf[fa]=fb;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        unf=new int[n+1];
        for(int i=1; i<=n; i++) unf[i]=i;
        for(int i=1; i<=m; i++){
            int a =sc.nextInt();
            int b =sc.nextInt();
            Union(a,b); //집합생성
        }

        int a=sc.nextInt();
        int b=sc.nextInt();

        int fa=Find(a);
        int fb=Find(b);
        if(fa==fb) System.out.println("YES");
        else System.out.println("NO");
    }
}
