package Exercicios.E030;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Student student = new Student(scan.nextLine(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
        student.passOrFail();
    }
}
