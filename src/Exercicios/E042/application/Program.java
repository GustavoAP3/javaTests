package Exercicios.E042.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = scan.nextInt();
        String[] names = new String[n];
        double[] avg = new double[n];

        for(int i = 0; i < names.length; i++){
            scan.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do "+ (i+1) +"o aluno:");
            names[i] = scan.nextLine();
            double n1 = scan.nextDouble();
            double n2 = scan.nextDouble();
            avg[i] = (n1 + n2) / 2.0;
        }
        System.out.println("Alunos aprovados:");
        for(int i = 0; i < names.length; i++){
            if(avg[i] >= 6.0){
                System.out.println(names[i]);
            }
        }

    }
}
