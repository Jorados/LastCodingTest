package TEST1.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class ex4 {
    public static int solution(String s1,String s2){
        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char x : s2.toCharArray()){
            map2.put(x,map2.getOrDefault(x,0)+1);
        }

        for(int i=0; i<s2.length()-1; i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        }

        int rt=0,lt=0;
        for(rt=s2.length()-1; rt<s1.length(); rt++){
            map1.put(s1.charAt(rt),map1.getOrDefault(s1.charAt(rt),0)+1);
                if(map1.equals(map2)) answer++;
                map1.put(s1.charAt(lt),map1.get(s1.charAt(lt))-1);
                if(map1.get(s1.charAt(lt)) == 0) map1.remove(s1.charAt(lt));
                lt++;
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
