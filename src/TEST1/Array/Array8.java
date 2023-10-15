package TEST1.Array;

import java.util.Scanner;

//등수 구하기
//더 높은 등수 나오면 p++

public class Array8 {
    public static int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i=0; i<arr.length; i++){
            int p = 1;
            for(int j=0; j<arr.length; j++){
                if(arr[j] > arr[i]) p++;
            }
            answer[i] = p;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : solution(n,arr)){
            System.out.print(x + " ");
        }
    }
}
