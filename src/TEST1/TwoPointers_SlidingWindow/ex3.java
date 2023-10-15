package TEST1.TwoPointers_SlidingWindow;

import java.util.Scanner;
//최대 매출 [ 슬라이딩 윈도우 ]
public class ex3 {
    public static int solution(int n, int k, int[] arr){
        int answer =0;
        int sum=0;
        for(int i=0; i<k; i++) sum+=arr[i];
        answer = sum;
        //핵심 로직
        for(int i=k; i<n; i++){
            sum+=(arr[i] - arr[i-k]);
            answer=Math.max(answer,sum);
        }

        return answer;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,k,arr));
    }
}
