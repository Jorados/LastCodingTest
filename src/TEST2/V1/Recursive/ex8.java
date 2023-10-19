package TEST2.V1.Recursive;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 송아지찾기 - BFS
public class ex8 {

    static int h; //현수
    static int s; // 송아지
    static int[] move = {1,-1,5};
    static boolean[] ch;
    public static int BFS(){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(h);
        ch[h]=true;
        int L=0;

        while (!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                Integer x = Q.poll();
                for(int j=0; j<3; j++){
                    int nx = x + move[j];
                    if(nx==s) return L+1;
                    if(nx>1 && nx<10001 && !ch[nx]){
                        ch[nx]=true;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return L;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        h = sc.nextInt();
        s = sc.nextInt();
        ch = new boolean[10001];


        System.out.println(BFS());
    }
}

//5
//-> 4 6 10
//-> 3 5 9 / 5 7 11 / 9 11 15
//-> 2 4 8/ 4 6 10 / 8 10 14