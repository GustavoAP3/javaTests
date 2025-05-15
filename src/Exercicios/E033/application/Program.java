package Exercicios.E033.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scan.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vect[i] = scan.nextInt();
        }
        System.out.println("NÚMEROS NEGATIVOS: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
    }
}
