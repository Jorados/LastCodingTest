package TEST1.String;

import java.util.Scanner;
//유효한 팰린드롬
// 입력 -> found7, time: study; Yduts; emit, 7Dnuof
// 출력 -> YES
// ',' ':' ';' 등 특수문자 무시하고 알파벳만 비교해서 앞뒤로 읽는게 같은 지 아닌 지
public class String8 {
    public static String solution(String str){
        String answer = "";
        String s = str.toUpperCase();
        String match = "[^A-Z]";
        s = s.replaceAll(match, "");

        String reverse = new StringBuffer(s).reverse().toString();

        if(s.equals(reverse)) answer ="YES";
        else answer="NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
