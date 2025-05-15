package Exercicios.E040.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scan.nextInt();
        int[] vect = new int[n];
        int countEven = 0;
        double sumEven = 0;

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            int n1 = scan.nextInt();
            vect[i] = n1;
            if(n1 % 2 == 0){
                sumEven += n1;
                countEven++;
            }
        }
        if(countEven == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double avgEven = (double)sumEven / countEven;
            System.out.printf("MEDIA DOS PARES = %.1f\n", avgEven);
        }

    }
}
