package TEST1.Array;

import java.util.ArrayList;
import java.util.Scanner;
//뒤집은 소수
public class Array6 {
    public static ArrayList<Integer> solution(int n, String[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] array = new int[n];

//        for(int i=0; i<arr.length; i++) {
//                TEST1.String tmp = new StringBuilder(arr[i]).reverse().toString();
//                array[i] += Integer.valueOf(tmp);
//        }

        for(int i=0; i<arr.length; i++) {
            String tmp = new StringBuffer(arr[i]).reverse().toString();
            array[i] += Integer.valueOf(tmp);
        }


        for(int i=0; i<array.length; i++){
            if(isPrime(array[i])) answer.add(array[i]);
        }
        return answer;
    }

    public static boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        for(int x : solution(n,arr)){
            System.out.print(x + " ");
        }
    }
}
