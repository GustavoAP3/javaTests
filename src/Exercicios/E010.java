package Exercicios;

import java.util.Scanner;

public class E010 {
    public static void main(String[] args) {
        /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        ordem crescente ou decrescente.
         */

        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        if(n1 % n2 == 0 || n2 % n1 == 0){
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
    }
}
