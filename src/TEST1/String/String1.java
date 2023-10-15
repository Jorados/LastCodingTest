package TEST1.String;

import java.util.Scanner;

//문자열 찾기
class String1 {
    public static int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();//string이 대문자가 된다.
        t = Character.toUpperCase(t); //들어오는 문자를 대문자로.

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == t){     //인덱스로 접근
                answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //콘솔에서 문자열 하나 읽어오는 거
        char c = sc.next().charAt(0); //TEST1.String 인덱스로 접근
        System.out.println(solution(str,c));
    }

}
