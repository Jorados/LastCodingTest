package TEST1.Sorting_Searching;

import java.util.Scanner;

//정렬로 구현
public class ex4_2 {
    public static int[] solution(int n, int k, int[] arr){
        int[] array = new int[n];
        for(int x: arr){
            //미스
            int pos=0;
            //히트
            for(int i=0; i<n; i++) {
                if(x==array[i]) pos=i; //히트면 pos인덱스가 바뀜
            }

            //미스
            if(pos==0){
                for(int i=n-1; i>=1; i--){
                    array[i] = array[i-1];
                }
                array[0]=x;
            }
            //히트
            else{
                for(int i=pos; i>=1; i--){
                    array[i]=array[i-1];
                }
                array[0]=x;
            }

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
