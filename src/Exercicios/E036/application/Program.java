package Exercicios.E036.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = scan.nextInt();
        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = scan.nextInt();
        }
        int quantityEven = 0;
        System.out.println("\nNUMEROS PARES:");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] % 2 == 0){
                System.out.print(vect[i] + " ");
                quantityEven++;
            }
        }
        System.out.println("\nQUANTIDADE DE PARES = "+ quantityEven);
    }
}
