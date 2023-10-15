package TEST1.Greedy;

//priorityQueue

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture>{
    public int money;
    public int day;
    Lecture(int money, int day){
        this.money = money;
        this.day = day;
    }
    @Override
    public int compareTo(Lecture o) {
        return o.day - this.day;
    }
}
public class ex4 {
    static int n=0,max=Integer.MIN_VALUE;
    public static int solution(ArrayList<Lecture> arr){
        int answer=0;
        //PriorityQueue pQ = new PriorityQueue<>(); //작은 값 우선
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); //큰 값 우선
        Collections.sort(arr);
        int j=0;
        for(int i=max; i>=1; i--){
            for( ; j<n; j++){ //j값 유지
                if(arr.get(j).day<i) break; //max보다 작으면 그만
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) answer+=pQ.poll();
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int money = sc.nextInt();
            int day = sc.nextInt();
            arr.add(new Lecture(money,day));
            if(day>max) max=day;
        }
        System.out.println(solution(arr));
    }

}
