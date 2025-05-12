package Exercicios;

import java.util.Scanner;

public class E003 {
    public static void main(String[] args) {
        // 1002
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double area = Math.PI * (raio*raio);

        System.out.printf("A=%.4f%n", area);
    }
}
