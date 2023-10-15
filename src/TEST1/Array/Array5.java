package TEST1.Array;

import java.util.Scanner;

//소수 구하기
//20
//-->8
public class Array5 {
    public static int solution(int n){
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i=2; i<arr.length; i++) {
            if (arr[i] == 0) {
                answer++;
                //i의 배수에 다 1 체크
                for (int j=i; j<arr.length; j=j+i) {
                    arr[j] = 1;
                }
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
