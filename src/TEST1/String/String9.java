package TEST1.String;

import java.util.Scanner;
//g0en2T0s8eSoft
//숫자만 추출
public class String9 {

//
//      for(char x : str.toCharArray()){
//      if(x>=48 && x<=57) answer = answer * 10+(x-48);
//      return answer

    public static String solution(String str){
        String answer = "";

        String match = "[^0-9]";
        str = str.replaceAll(match, "");
        answer += Integer.parseInt(str);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
