package Exercicios.E035.application;

import Exercicios.E035.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantity = scan.nextInt();
        double sumHeight = 0.0;
        int sumLeastThenSixteen = 0;
        Person[] persons = new Person[quantity];
        for(int i = 0; i < persons.length; i++){
            System.out.println("Dados da "+ (i+1) +"a pessoa");
            scan.nextLine();
            System.out.print("Nome: ");
            String name = scan.nextLine();
            System.out.print("Idade: ");
            int age = scan.nextInt();
            System.out.print("Altura: ");
            double height = scan.nextDouble();
            persons[i] = new Person(name, age, height);
            sumHeight += height;
            if (age < 16) {
                sumLeastThenSixteen += 1;
            }
        }
        System.out.println();

        double avg = sumHeight / persons.length;
        double leastThenSixteenPercentage = (double)sumLeastThenSixteen / persons.length * 100;

        System.out.printf("Altura média: %.2f\n", avg);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", leastThenSixteenPercentage);
        for(Person person : persons){
            if(person.getAge() < 16){
                System.out.println(person.getName());
            }
        }

    }
}
