package TEST1.TwoPointers_SlidingWindow;

import java.util.Scanner;

public class ex5 {
    public static int solution(int n){
        int answer =0;
        int lt=0,rt=0;
        int sum=0;
        int arr[] = new int[n];

        for(int i=0; i<n; i++) arr[i]=i+1;

        //인덱스 0번 값은 1부터 시작이기 때문에 n-1까지만 돌아야
        //자기 자신 값을 제외할 수 있다.
        for(rt=0; rt<n-1; rt++){
            sum+=arr[rt];
            if(sum == n) answer++;
            while(sum >= n){
                    sum-=arr[lt];
                    lt++;
                    if(sum==n) answer++;
                }
            }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
