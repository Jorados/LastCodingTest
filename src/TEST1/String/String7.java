package TEST1.String;

import java.util.Scanner;
//회문 문자열
public class String7 {
    public static String solution(String str){
        String answer = "";
        String s = str.toUpperCase();

//        StringBuffer sb = new StringBuffer(s);
//        TEST1.String reverse = sb.reverse().toString();

        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        if(s.equals(reverse)) answer = "YES";
        else  answer = "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
