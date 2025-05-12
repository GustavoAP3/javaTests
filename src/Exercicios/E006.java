package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class E006 {
    public static void main(String[] args) {
        // B1010
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int codigo, numeroPecas;
        double valorPeca, total;
        total = 0;

        for(int i = 0; i < 2; i++){
            codigo = scan.nextInt();
            numeroPecas = scan.nextInt();
            valorPeca = scan.nextDouble();
            total += (double)numeroPecas * valorPeca;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
