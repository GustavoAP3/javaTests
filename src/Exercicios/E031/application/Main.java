package Exercicios.E031.application;

import Exercicios.E031.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scan.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantityBought = scan.nextDouble();
        double total = CurrencyConverter.convert(dollarPrice, quantityBought);
        System.out.printf("Amount to be paid in reais = R$ %.2f\n", total);
    }
}
