package Conceitos.OrientacaoObjetos02;

import Conceitos.OrientacaoObjetos02.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = scan.nextLine();
        System.out.print("Price: ");
        product.price = scan.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = scan.nextInt();

        System.out.println("\nProduct data: " + product);

        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        product.AddProducts(quantity);
        System.out.println("\nUpdated data: " + product);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.RemoveProducts(quantity);
        System.out.println("\nUpdated data: " + product);


    }
}
