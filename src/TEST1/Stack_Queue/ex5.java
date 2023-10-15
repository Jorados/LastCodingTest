package TEST1.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

//레이저에의해 잘려진 쇠막대기 갯수
//()(((()())(())()))(())
// --> 17
//Stack
public class ex5 {
    public static int solution(String s){
        int answer =0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') stack.push(s.charAt(i));
            else if(s.charAt(i)==')') {
                stack.pop();
                if(s.charAt(i-1) == '(') answer += stack.size();
                else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(solution(s));
    }

}
