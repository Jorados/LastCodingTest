package TEST1.Sorting_Searching;

import java.io.IOException;
import java.util.Scanner;

//선택 정렬
public class ex1 {
    public static int[] solution(int n,int[] arr){
        int[] answer = new int[n];

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
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
