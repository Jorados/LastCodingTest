package TEST1.DFS_BFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex5 {
    static int n,m;
    static int answer=Integer.MAX_VALUE;

    public static void DFS(int L,int sum,Integer[] arr){
        if(sum>m) return;
        if(L>=answer) return;
        if(sum==m) answer = Math.min(answer,L);
        else{
            for(int i=0; i<n; i++){
                DFS(L+1,sum+arr[i],arr);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        //-->기본형 int 말고 객체형 int(Integer)만 정렬가능
        //-->속도 높여주기 위해서 역순으로 정렬
        m = sc.nextInt();
        DFS(0,0,arr);
        System.out.print(answer);
    }
}
