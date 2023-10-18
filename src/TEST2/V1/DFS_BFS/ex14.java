package TEST2.V1.DFS_BFS;


import java.util.ArrayList;
import java.util.Scanner;

// 피자 배달 거리 - DFS

class Point2 {
    int x;
    int y;
    public Point2(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class ex14 {
    static int n,m,len,answer=Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point2> hs,pz;

    public static void DFS(int L, int s){
        if(L==m){
            int sum=0;
            for(Point2 h : hs){
                int dis = Integer.MAX_VALUE;
                for(int i : combi){
                    dis = Math.min(dis,Math.abs(h.x-pz.get(i).x) + Math.abs(h.y-pz.get(i).y));
                }
                sum+=dis;
            }
            answer=Math.min(answer,sum);
        }
        else{
            for(int i=s; i<len; i++){
                combi[L]=i;
                DFS(L+1,i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int input = sc.nextInt();
                if(input==1) hs.add(new Point2(i,j));
                else if(input==2) pz.add(new Point2(i,j));
            }
        }
        len = pz.size();
        combi = new int[m];
        DFS(0,0); //L,s
        System.out.println(answer);
    }
}
