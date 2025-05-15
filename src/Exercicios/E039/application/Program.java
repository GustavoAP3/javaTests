package Exercicios.E039.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scan.nextInt();
        double[] vect = new double[n];
        double sum = 0;
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            double n1 = scan.nextDouble();
            vect[i] = n1;
            sum += n1;
        }
        double avg = sum / vect.length;
        System.out.printf("\nMEDIA DO VETOR = %.3f\n", avg);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(double num : vect){
            if(num < avg){
                System.out.printf("%.1f\n", num);
            }
        }
    }
}
