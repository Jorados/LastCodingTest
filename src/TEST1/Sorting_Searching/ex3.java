package TEST1.Sorting_Searching;

import java.util.Scanner;

public class ex3 {
    public static int[] solution(int n,int[] arr){
        for(int i=1; i<n; i++){
            int tmp=arr[i]; int j;
            for(j=i-1; j>=0; j--){
                //한칸씩 오른쪽으로 민다.
                if(arr[j]>tmp) arr[j+1]=arr[j];
                else break;
            }
            //for문이 멈춘 j의 바로 뒤에 tmp값 삽입.
            arr[j+1]=tmp;
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x: solution(n,arr)){
            System.out.print(x+" ");
        }
    }
}
