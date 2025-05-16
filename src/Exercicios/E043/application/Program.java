package Exercicios.E043.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = scan.nextInt();
        double[] heights = new double[n];
        String[] genres = new String[n];
        scan.nextLine();
        for(int i = 0; i < heights.length; i++){
            System.out.print("Altura da "+ (i+1) +"a pessoa: ");
            heights[i] = scan.nextDouble();
            scan.nextLine();
            System.out.print("Genero da "+ (i+1) +"a pessoa: ");
            genres[i] = scan.nextLine();
        }
        double shorter = heights[0];
        double higher = heights[0];
        double sumFemaleAvg = 0;
        int countFemale = 0;
        int countMale = 0;
        for(int i = 0; i < heights.length; i++){
            if(shorter > heights[i]){
                shorter = heights[i];
            }
            if(higher < heights[i]){
                higher = heights[i];
            }
            if(genres[i].equalsIgnoreCase("F")){
                sumFemaleAvg += heights[i];
                countFemale++;
            } else {
                countMale++;
            }
        }
        double femaleAvg = sumFemaleAvg / countFemale;

        System.out.println();
        System.out.println("Menor altura = "+ shorter);
        System.out.println("Maior altura = "+ higher);
        System.out.printf("Média das alturas das mulheres = %.2f\n", femaleAvg);
        System.out.println("Número de homens = "+ countMale);
    }
}
