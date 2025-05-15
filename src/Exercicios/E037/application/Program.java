package Exercicios.E037.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = scan.nextInt();
        double[] numbers = new double[n];
        scan.nextLine();
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Digite um número: ");
            numbers[i] = scan.nextDouble();
        }
        double greaterNumber = 0.0;
        int position = 0;
        for(int i = 0; i < numbers.length; i++){
            if(i == 0){
                greaterNumber = numbers[i];
            }
            if(i > 0 && numbers[i] > greaterNumber){
                greaterNumber = numbers[i];
                position = i;
            }
        }
        System.out.printf("\nMAIOR VALOR = %.2f\n", greaterNumber);
        System.out.println("POSIÇÃO DO MAIOR VALOR = "+ position);
    }
}
