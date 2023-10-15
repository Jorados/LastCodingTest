package TEST1.String;

import java.util.Scanner;

public class String6 {
    public static String solution(String str){
        String answer = "";
        for(int i=0; i<str.length(); i++){
            if(i == str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
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
