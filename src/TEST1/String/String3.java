package TEST1.String;

import java.util.Scanner;

//문자열에서 가장 긴 단어 찾기
//최댓값 알고리즘
public class String3 {
    public static String solution(String str){
        String answer = "";
        int len = 0;
        String[] s = str.split(" ");

        for(int i=0; i<s.length; i++){
            if(s[i].length() > len){
                len = s[i].length();
                answer = s[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
