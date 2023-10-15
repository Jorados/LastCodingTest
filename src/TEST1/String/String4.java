package TEST1.String;

import java.util.*;

//단어 뒤집기
//3
//good -> doog
//Time -> emiT
//Big -> giB
public class String4 {
    public static ArrayList<String> solution(int n,String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        //방식1
//        for(TEST1.String x : str){
//            TEST1.String tmp = new StringBuilder(x) //빌더 객체를 만들어서 뒤집고 스트링으로 만들기
//                    .reverse()
//                    .toString();
//            answer.add(tmp); //arrayList에 추가하는 것은 add().
//        }

        //방식2
        for (String x : str) {
            char[] s = x.toCharArray(); //문자열을 문자 하나하나에 접근
            int lt = 0;
            int rt = x.length() - 1;
            while (lt < rt) {     //문자열 뒤집는 알고리즘
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--; //여기까지는 CharArray이기 때문에 다시 String화 해줘야한다.
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }
        for(String x : solution(n,str)){
            System.out.println(x);
        }
    }
}
