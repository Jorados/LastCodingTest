package TEST1.String;

import java.util.Scanner;
//가장 짧은 문자 거리
public class String10 {

    public static int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        //0번인덱스 왼쪽에는 t가 없기때문에 0값 들어가는 거 방지용
        int p=1000;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == t){
                p=0;
                answer[i] = p;
            }
            else {
                p++;
                answer[i] = p;
            }
        }

        p=1000; //초기화
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == t){
                p=0;
            }
            else{
                p++;
                //둘 중에 작은 값
                answer[i] = Math.min(answer[i],p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        for(int x : solution(str, c)){
            System.out.print(x + " ");
        }

    }
}
