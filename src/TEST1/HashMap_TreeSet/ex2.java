package TEST1.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class ex2 {
    public static String solution(String s,String x){
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c1 : s.toCharArray()){
            map.put(c1,map.getOrDefault(c1,0) + 1);
        }

        for(char c2 : x.toCharArray()){
            if(!map.containsKey(c2) || map.get(c2)==0) return answer="NO";
            map.put(c2,map.get(c2)-1);
        }


        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String x = sc.next();
        System.out.println(solution(s,x));
    }
}
