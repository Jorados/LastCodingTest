import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
public class ex1 {

    static int n;
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int sum=0;
            for(int j=0; j<10; j++){
                int num = sc.nextInt();
                if(num%2!=0) sum+=num;
            }
            System.out.println("#" + i + " " + sum);
        }

    }
}