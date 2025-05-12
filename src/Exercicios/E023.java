package Exercicios;

import java.util.Scanner;

public class E023 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            if(n2 == 0){
                System.out.println("divisao impossivel");
            } else {
                System.out.println((double)n1 / (double)n2);
            }
        }
    }
}
