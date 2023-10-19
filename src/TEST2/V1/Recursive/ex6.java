package TEST2.V1.Recursive;


import java.util.Scanner;

// 부분 집합 구하기 - DFS
public class ex6 {

    static int n;
    static int[] ch;

    public static void DFS(int L){
        if(L>n){
            for(int i=0; i< ch.length; i++){
                if(ch[i]!=0){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        else{
            ch[L]=1;
            DFS(L+1);
            ch[L]=0; // 그냥 지나가는 거임
            DFS(L+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n+1];
        DFS(1);
    }
}
