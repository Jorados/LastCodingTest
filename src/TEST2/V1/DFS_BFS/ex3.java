package TEST2.V1.DFS_BFS;


import java.util.ArrayList;
import java.util.Scanner;

// 최대점수 구하기 - DFS
class Game{
    int score;
    int time;
    public Game(int score,int time) {
        this.score =score;
        this.time =time;
    }
}
public class ex3 {
    static int n,answer=Integer.MIN_VALUE;
    static int m; // 제한시간
    static boolean[] ch;
    static ArrayList<Game> list = new ArrayList();

    public static void DFS(int sum,int et){
        if(et <= m){
            answer = Math.max(answer,sum);
        }
        if(et > m) return;

        for(int i=0; i<n; i++){
            if(!ch[i]){
                ch[i] = true;
                DFS(sum+list.get(i).score,et+list.get(i).time);
                ch[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Game(a,b));
        }

        ch = new boolean[n];
        DFS(0,0);
        System.out.println(answer);
    }
}
