package TEST1.Sorting_Searching;

import java.util.Scanner;

//버블 정렬
public class ex2 {
    public static int[] solution(int n,int[] arr){
        int[] answer = new int[n];
        for(int i=0; i <arr.length; i++) { //턴 횟수
            for(int j=0; j <arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp;
                }
            }
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
