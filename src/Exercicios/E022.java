package Exercicios;

public class E022 {
    public static void main(String[] args) {
        // primos até 100
        System.out.println("Números primos entre 1 e 100:");

        for (int numero = 2; numero <= 100; numero++) {
            boolean ehPrimo = true;
            for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
                if (numero % divisor == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.print(numero + " ");
            }
        }
    }
}
