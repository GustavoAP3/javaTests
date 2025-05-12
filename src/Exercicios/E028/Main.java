package Exercicios.E028;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        Rectangle rectangle = new Rectangle(scan.nextDouble(), scan.nextDouble());

        System.out.printf("AREA = %.2f\n", rectangle.Area());
        System.out.printf("PERIMETER = %.2f\n", rectangle.Perimeter());
        System.out.printf("DIAGONAL = %.2f\n", rectangle.Diagonal());
    }
}
