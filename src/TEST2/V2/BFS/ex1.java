package TEST2.V2.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 타일 점프
public class ex1 {
    static int n,answer=0;
    static int[] nums;
    static boolean[] ch;

    public static int BFS(){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(0);
        ch[0]=true;

        while (!Q.isEmpty()){
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                Integer poll = Q.poll();
                for(int j=1; j<=nums[poll]; j++){
                    int nx = poll + j;
                    if(nx == nums.length-1) return answer+1;
                    if(nx<nums.length && !ch[nx]){
                        ch[nx]=true;
                        Q.offer(nx);
                    }
                }
            }
            answer++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        ch = new boolean[n];

        System.out.println(BFS());
    }
}
