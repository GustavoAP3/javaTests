package Conceitos.Arrays2.application;

import Conceitos.Arrays2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length; i++){
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();
            vect[i] = new Product(name, price);
        }
        double sum = 0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("AVARAGE PRICE = %.2f\n", avg);


    }
}
