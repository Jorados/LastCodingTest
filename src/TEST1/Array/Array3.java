package TEST1.Array;

import java.util.ArrayList;
import java.util.Scanner;



//1->가위 2->바위 3->보

//5
//A :   2 3 3 1 3
//B :   1 1 2 2 3
//결과 : A B A B D

public class Array3 {
    public static ArrayList<String> solution(int n, int[] A,int[] B){
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(A[i] == B[i])answer.add("D");
            else if(A[i] == 1 && B[i] == 3) answer.add("A");
            else if(A[i] == 2 && B[i] == 1) answer.add("A");
            else if(A[i] == 3 && B[i] == 2) answer.add("A");
            else answer.add("B");
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            B[i] = sc.nextInt();
        }
        for (String s : solution(n, A, B)) {
            System.out.println(s);
        }
    }
}
