package TEST1.Array;

import java.util.Scanner;

//멘토,멘티 경우의 수
//4 3
//3 4 1 2
//4 3 2 1
//3 1 4 2
// --> 3
public class Array12 {
    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;
        //학생 수를 1~4로 할거라서 1부터 i<=n까지
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt=0;
                for(int k=0; k<m; k++){
                    int pi=0,pj=0;
                    for(int s=0; s<n; s++){
                        //몇번 테스트에서 i,j가 몇등씩 했는지 등수 체크
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++; //s가 더 작으면 더 높은 등수
                }
                if(cnt==m){
                    //cnt(등수 더 높은 경우)가 테스트 횟수랑 같으면
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, m, arr));
    }
}
