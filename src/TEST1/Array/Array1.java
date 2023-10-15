package TEST1.Array;

import java.util.ArrayList;
import java.util.Scanner;

//6
//7 3 9 5 6 12
// --> 7 9 6 12
public class Array1 {
    public static ArrayList<Integer> solution(int n, int[] number){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(number[0]);
        for(int i=1; i<number.length; i++){
            if(number[i] > number[i-1]) {
                answer.add(number[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for(int i=0; i<n; i++){
            number[i] = sc.nextInt();
        }
        for(int x : solution(n, number)){
            System.out.print(x + " ");
        }
    }
}
