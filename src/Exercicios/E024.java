package Exercicios;

import java.util.Scanner;

public class E024 {
    public static void main(String[] args) {
        // fatorial
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fatorial = 1;

        for(int i = 1; i <= n; i++){
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
