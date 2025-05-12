package Exercicios;

import java.util.Scanner;

public class E026 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.printf("%d %d %d\n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
        }
    }
}
