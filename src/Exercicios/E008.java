package Exercicios;

import java.util.Scanner;

public class E008 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        if(numero >= 0){
            System.out.println("NÃO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

    }
}
