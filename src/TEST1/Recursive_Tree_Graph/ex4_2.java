package TEST1.Recursive_Tree_Graph;

import java.util.Scanner;

//메모이제이션 --> (배열에) 기록을 한다는 뜻.
//스택 프레임
//재귀 핵심
public class ex4_2 {
    static int[] fibo;
    public static int fibonacci(int n){
        //핵심 //fibo(배열)의 값은 0으로 초기화 되어있는 것을 이용
        //해당 n값이 구해져있으면 그거 가져다 쓴다는 뜻.
        if(fibo[n]>0) return fibo[n];

        if(n==1||n==2) return fibo[n]=1;
        else return fibo[n] = fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo=new int[n+1];
        fibonacci(n);
        for(int i=1; i<=n; i++){
            System.out.print(fibo[i]+" ");
        }
    }
}
