package Exercicios;

import java.util.Scanner;

public class E018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int alcool = 0, gasolina = 0, diesel = 0;
        while(numero != 4){
            numero = scan.nextInt();
            switch(numero){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        }
        System.out.println("\nMUITO OBRIGADO");
        System.out.println("Alcool: "+ alcool);
        System.out.println("Gasolina: "+ gasolina);
        System.out.println("Diesel: "+ diesel);
    }
}
