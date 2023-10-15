package TEST1.TwoPointers_SlidingWindow;

import java.util.Scanner;

//연속 부분 수열 [ 복합 문제 ]
public class ex4 {
    public static int solution(int n, int m, int[] arr){
        int answer =0;
        int sum=0,lt=0;
        for(int rt=0; rt<arr.length; rt++){
            sum+=arr[rt];
            if(sum==m) answer++;
            while(sum>=m){
                sum-=arr[lt];
                lt++;
                if(sum==m) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,m,arr));
    }
}
