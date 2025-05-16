package Exercicios.E041.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = scan.nextInt();
        //String[][] persons = new String[n][n];
        String[] names = new String[n];
        int[] ages = new int[n];
        for(int i = 0; i < names.length; i++){
            scan.nextLine();
            System.out.println("Dados da "+ (i+1) +"a pessoa:");
            System.out.print("Nome: ");
            names[i] = scan.nextLine();
            System.out.print("Idade: ");
            ages[i] = scan.nextInt();
        }
        int num = 0;
        for(int i = 0; i < names.length; i++){
            if(i > 0 && ages[i] > ages[i-1]){
                num = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: "+ names[num]);
    }
}
