package TEST1.Sorting_Searching;

import java.util.Scanner;
import java.util.Stack;

//스택으로 구현
public class ex4 {
    public static int[] solution(int n, int k, int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] array = new int[n];

        for(int x: arr){
            if(stack.contains(x)){
                stack.remove(stack.indexOf(x));
                stack.push(x);
            }
            else{
                stack.push(x);
                if (stack.size() > n) {
                    stack.remove(0);
                }
            }
        }
        for(int i=0; i<n; i++){
            array[i] = stack.pop();
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k = sc.nextInt();
        int[] arr = new int[k];
        for(int i=0; i<k; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : solution(n,k,arr)) System.out.print(x + " ");
    }
}
