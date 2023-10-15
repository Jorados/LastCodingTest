package TEST1.Recursive_Tree_Graph;

import java.util.Scanner;

public class ex1_2 {
    public static void solution(int n){
        if(n==0) return;
        else{
            solution(n-1);
            System.out.print(n + " ");
            //재귀함수는 스택프레임을 사용한다.
            //호출이 끝나면 전 함수로 복귀한다.
            //빽 트래킹
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}
