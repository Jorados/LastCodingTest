package TEST1.Recursive_Tree_Graph;

import java.util.Scanner;

public class ex3 {
    public static int factorial(int n){
        if(n<=1) return n;
        else return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
