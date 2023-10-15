package TEST1.Dynamic;

import java.util.Scanner;

//계단 오르기
public class ex1 {
    public static int solution(int n,int[] dy){
        dy[1]=1;
        dy[2]=2;
        for(int i=3; i<=n; i++){
            dy[i] = dy[i-1] + dy[i-2];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dy = new int[n+1];
        System.out.println(solution(n,dy));
    }
}
