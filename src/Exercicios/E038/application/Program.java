package Exercicios.E038.application;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = scan.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < vectA.length; i++){
            vectA[i] = scan.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < vectB.length; i++){
            vectB[i] = scan.nextInt();
        }
        for(int i = 0; i < vectC.length; i++){
            vectC[i] = vectA[i] + vectB[i];
        }
        System.out.println("Vetor resultante:");
        // can do it in one 'for', but who cares?
        for (int j : vectC) {
            System.out.println(j);
        }
    }
}
