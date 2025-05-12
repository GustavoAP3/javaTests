package Exercicios;

import java.util.Scanner;

public class E016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int senhaCorreta = 2002;
        while(true){
            int senha = scan.nextInt();
            if(senha == senhaCorreta){
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
        scan.close();

        // outra forma
        System.out.println();

        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
