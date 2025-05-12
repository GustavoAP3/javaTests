package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class E012 {
    public static void main(String[] args) {
        // B1038
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int codigo = scan.nextInt();
        int quantidade = scan.nextInt();
        double valorTotal;
        switch(codigo){
            default:
                System.out.println("Codigo não cadastrado");
            case 1:
                valorTotal = quantidade * 4.00;
                break;
            case 2:
                valorTotal = quantidade * 4.50;
                break;
            case 3 :
                valorTotal = quantidade * 5.00;
                break;
            case 4:
                valorTotal = quantidade * 2.00;
                break;
            case 5:
                valorTotal = quantidade * 1.50;
                break;
        }
        System.out.printf("Total: R$ %.2f", valorTotal);
    }
}
