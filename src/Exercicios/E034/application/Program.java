package Exercicios.E034.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scan.nextInt();
        double[] vect = new double[n];
        double sum = 0;
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = scan.nextDouble();
            sum += vect[i];
        }
        System.out.println();

        System.out.print("VALORES = ");
        for(int i = 0; i < vect.length; i++){
            System.out.printf("%.2f ", vect[i]);
        }
        System.out.println("\nSOMAR = "+ sum);
        System.out.printf("MEDIA = %.2f\n", sum / vect.length);

    }
}
