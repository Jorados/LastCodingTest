package TEST2.V1.DFS_BFS;


import java.util.Scanner;

// 합이 같은 부분집합
public class ex1 {

    static int n,sum=0;
    static int[] arr;
    static boolean answer = false;

    public static void DFS(int num,int L){
        // 뺵트래킹 설정을 잘해줘야한다.
        if(answer) return;
        if(num > sum/2) return;
        if(L==n){
            if(sum-num == num){
                answer = true;
            }
        }
        else{
            DFS(num+arr[L],L+1);
            DFS(num,L+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // 다 합하면 32
        // 그래서 배열에 담아서 합이 sum/2가 되면 yes 안되면 false;
        DFS(0,0);
        if(answer) System.out.println("YES");
        else System.out.println("NO");
    }
}
