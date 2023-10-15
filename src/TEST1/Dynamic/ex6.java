package TEST1.Dynamic;

import java.util.Scanner;

//최대점수 구하기(냅색 알고리즘)
public class ex6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dy=new int[m+1];
        for(int i=0; i<n; i++){
            int score = sc.nextInt();
            int time = sc.nextInt();
            for(int j=m; j>=time; j--){
                dy[j] = Math.max(dy[j],dy[j-time]+score);
            }
        }
        System.out.println(dy[m]);
    }
}
