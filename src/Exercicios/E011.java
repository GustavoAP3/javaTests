package Exercicios;

import java.util.Scanner;

public class E011 {
    public static void main(String[] args) {
        /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
         */
        Scanner scan = new Scanner(System.in);
        int horaInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        int horas = 0;
        if(horaInicial == horaFinal){
            horas = 24;
        } else {
            int count = horaInicial;
            while(count != horaFinal){
                if(count == 24){
                    count = 0;
                }
                horas++;
                count++;
            }
        }
        System.out.println("O JOGO DUROU "+ horas +" HORA(S)");

        System.out.println();

        // Forma menos psicopata e mais simples:
        horaInicial = scan.nextInt();
        horaFinal = scan.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
