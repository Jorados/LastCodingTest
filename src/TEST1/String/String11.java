package TEST1.String;

import java.util.Scanner;
//문자열 압축
public class String11 {
    public static String solution(String str){
        String answer = "";
        str = str + " ";
        int p=1;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                p++;
            }
            else if(str.charAt(i) != str.charAt(i+1)){
                answer += str.charAt(i);
                if(p>1){
                    answer += String.valueOf(p);
                    }
                    p=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
