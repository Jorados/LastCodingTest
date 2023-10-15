package TEST1.Dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//가장 높은 탑 쌓기

class Doll implements Comparable<Doll>{
    int s;
    int h;
    int w;

    public Doll(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Doll o) {
        return o.s - this.s;
    }
}

public class ex4 {
    static int s=0,h=0,w=0,n=0;
    static int[] dy;
    public static int solution(ArrayList<Doll> arr){
        int answer=0;
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        for(int i=0; i<n; i++){
            int max_h=0;
            for(int j=i-1; j>=0; j--){
                if(arr.get(j).w>arr.get(i).w && dy[j]>max_h){
                    max_h=dy[j];
                }
            }
            dy[i]=arr.get(i).h + max_h;
            answer=Math.max(answer,dy[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dy = new int[n];
        ArrayList<Doll> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            s = sc.nextInt();
            h = sc.nextInt();
            w = sc.nextInt();
            arr.add(new Doll(s,h,w));
        }
        System.out.println(solution(arr));
    }

}
