package TEST2.V2.BFS;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 송아지를 잡자
public class ex3 {
    static int s,e;
    static int answer=0;
    static boolean[] ch;
    public static void BFS(){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(s);

        while (!Q.isEmpty()){
            int size = Q.size();
            answer++;
            for(int i=0; i<size; i++){
                Integer poll = Q.poll(); // s
                for(int nx : new int[]{poll+1,poll-1,poll*2}){
                    if(nx>0 && nx<=200000 && !ch[nx]){
                        ch[nx] = true;
                        Q.offer(nx);
                    }
                }
            }
            e+=answer;
            if(e > 200000) answer=-1;
            if(ch[e]) break;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        s = sc.nextInt();
        e = sc.nextInt();
        ch = new boolean[200001];
        BFS();
        System.out.println(answer);
    }
}
