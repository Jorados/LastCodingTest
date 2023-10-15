package TEST1.Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;
//간단한 문제
//이분 검색으로 풀기
public class ex8 {
    public static int solution(int n,int k, int[] arr){
        int answer =0;
        Arrays.sort(arr);
        int lt=0,rt=arr.length-1;
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(arr[mid] == k){
                answer = mid + 1;
            }
            if(arr[mid] > k) rt=mid-1;
            else lt=mid+1;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solution(n,k,arr));
    }
}
