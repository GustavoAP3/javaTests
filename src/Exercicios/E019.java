package Exercicios;

import java.util.Scanner;

public class E019 {
    public static void main(String[] args) {
        // B1067
        // impares de 1 a x
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("---------");
        for(int i = 1; i <= x; i += 2){
            System.out.println(i);
        }
    }
}
