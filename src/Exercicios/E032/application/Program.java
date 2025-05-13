package Exercicios.E032.application;

import Exercicios.E032.entities.bankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter account holder: ");
        String holder = scan.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        String response = scan.nextLine();

        double depositValue = 0;
        if(response.equalsIgnoreCase("y")){
            System.out.print("Enter initial deposit value: ");
            depositValue = scan.nextDouble();
        }
        bankAccount account = new bankAccount(accountNumber, holder, depositValue);

        System.out.println("\nAccount data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        depositValue = scan.nextDouble();
        account.Depositar(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        depositValue = scan.nextDouble();
        account.Sacar(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);
    }
}
