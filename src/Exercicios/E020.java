package Exercicios;

import java.util.Scanner;

public class E020 {
    public static void main(String[] args) {
        // B1072
        Scanner scan = new Scanner(System.in);
        int in = 0, out = 0;
        int quantidade = scan.nextInt();
        System.out.println();
        for(int i = 0; i < quantidade; i++){
            int n = scan.nextInt();
            if(n > 20 || n < 10)
                out++;
            else
                in++;
        }
        System.out.println("\n"+ in + " in");
        System.out.println(out + " out");
    }
}
