package TEST1.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//교육과정 설계 Queue
public class ex7 {
    public static String solution(String s1,String s2){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        for(char x : s1.toCharArray()){
            Q.offer(x);
        }
        for(char x : s2.toCharArray()){
            if(Q.contains(x)){
                if(x!=Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.print(solution(s1,s2));
    }
}
