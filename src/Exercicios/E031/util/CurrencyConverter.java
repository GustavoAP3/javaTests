package Exercicios.E031.util;

public class CurrencyConverter {
    public static final double IOF = 6.0 / 100;
    public static double convert(double price, double quantity){
        return (price * quantity) + (quantity * price * IOF);
    }
}
