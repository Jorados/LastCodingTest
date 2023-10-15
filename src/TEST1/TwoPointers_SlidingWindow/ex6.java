package TEST1.TwoPointers_SlidingWindow;

import java.util.Scanner;

//연속된 1의 합
public class ex6 {
    public static int solution(int n, int k, int[] arr){
        int answer =0;
        int cnt=0,rt=0,lt=0;
        for(rt=0; rt<arr.length; rt++){
            if(arr[rt] == 0) cnt++;
            while(cnt>k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
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
