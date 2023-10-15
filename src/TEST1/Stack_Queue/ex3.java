package TEST1.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

//Stack
public class ex3 {
    public static int solution(int n, int[][] arr,int k, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves){
            for(int i=0; i<arr.length; i++){
                if(arr[i][pos-1]!=0){
                    int tmp = arr[i][pos-1];
                    arr[i][pos-1]=0;
                    if(!stack.isEmpty() &&  tmp==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int[] moves = new int[k];
        for(int i=0; i<k; i++){
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(n,arr,k,moves));
    }
}
