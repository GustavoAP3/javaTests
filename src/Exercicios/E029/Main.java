package Exercicios.E029;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = scan.nextDouble();
        System.out.print("Tax: ");
        double tax = scan.nextDouble();

        Employee employee1 = new Employee(name, grossSalary, tax);

        System.out.println("Employee: " + employee1);

        System.out.print("Which percentage to increase salary? ");
        employee1.increaseSalary(scan.nextDouble());

        System.out.println("Updated data: " + employee1);

    }
}
