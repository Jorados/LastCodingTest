package TEST1.Recursive_Tree_Graph;

import java.util.Scanner;

//재귀를 이용해서 1-N까지 출력하라
public class ex1 {
    public static void solution(int n){
        int[] answer= new int[n];
        for(int i=0; i<n; i++){
            answer[i] = i+1;
        }
        for(int x : answer){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}
