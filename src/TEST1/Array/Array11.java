package TEST1.Array;

import java.util.Scanner;

//반장 뽑기
//5
//1번학생 : 2 3 1 7 3
//2번학생 : 4 1 9 6 8
//3번학생 : 5 5 2 4 4
//4번학생 : 6 5 2 6 7
//5번학생 : 8 4 2 2 2
// --> 4
public class Array11 {
    public static int solution(int n, int[][] arr){
        int answer = 0;
        int max =0;

        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //무조건 5학급이니까 6으로 고정 학생 수는 늘어날 수 있으니까
        //n으로 하고 1번학생부터 시작 -> +1
        int[][] arr = new int[n+1][6];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(solution(n,arr));
    }

}
