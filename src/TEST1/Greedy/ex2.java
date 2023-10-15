package TEST1.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    public int startT;
    public int lastT;
    public Time(int startT, int lastT) {
        this.startT = startT;
        this.lastT = lastT;
    }

    @Override
    public int compareTo(Time o) {
        if(this.lastT==o.lastT) return this.startT-o.startT;
        else return this.lastT-o.lastT;
    }
}

public class ex2 {
    public static int solution(ArrayList<Time> arr,int n){
        int answer =0;
        Collections.sort(arr);
        int end=Integer.MIN_VALUE;
        for(Time x : arr){
            if(x.startT >= end){
                answer++;
                end=x.lastT;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int startT=sc.nextInt();
            int lastT=sc.nextInt();
            arr.add(new Time(startT,lastT));
        }
        System.out.println(solution(arr,n));
    }
}
