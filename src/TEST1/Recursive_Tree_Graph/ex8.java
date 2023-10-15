package TEST1.Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//송아지 찾기
public class ex8 {
    public static int BFS(int s,int e){
        int[] dis={1,-1,5};
        int[] ch = new int[10001];
        Queue<Integer> Q = new LinkedList<>();
        ch[s] = 1;
        Q.offer(s);
        int L=0;

        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                int x = Q.poll();
                for(int j=0; j<3; j++){
                    int nx = x + dis[j];
                    if(nx==e) return L+1;
                    if(nx>=1 && nx<=10000 && ch[nx]==0){
                        ch[nx]= 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return L;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(BFS(s,e));
    }
}
