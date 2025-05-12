package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class E005 {
    public static void main(String[] args) {
        //B1008
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int numeroFunc = scan.nextInt();
        int numeroHoras = scan.nextInt();
        double valorHora = scan.nextDouble();
        double salario = numeroHoras * valorHora;

        System.out.println("NUMBER = "+ numeroFunc);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
