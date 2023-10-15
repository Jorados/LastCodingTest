package TEST1.String;

import java.util.Scanner;


//특정 문자 뒤집기
//1.lt,rt 가 가리키는게 알파벳인지 확인
//2.둘다 알파벳일 경우에 자리 체인지
class String5 {
    public static String solution(String str){
        String answer = "";

        char[] arr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(arr);
        return answer;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
