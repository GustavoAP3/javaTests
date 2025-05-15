package Exercicios.E032.entities;

public class bankAccount {
    private final int numeroConta;
    private String nomeTitular;
    private double valorEmConta;

    public bankAccount(int numeroConta, String nomeTitular, double valorDeposito){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        Depositar(valorDeposito);
    }
    public bankAccount(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta(){
        return numeroConta;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public double getValorEmConta() {
        return valorEmConta;
    }

    public void Depositar(double valor){
        valorEmConta += valor;
    }
    public void Sacar(double valor){
        valorEmConta -= valor + 5;
    }

    public String toString() {
        return "Account " + numeroConta
                + ", Holder: "
                + nomeTitular
                + ", Balance: $ "
                + String.format("%.2f", valorEmConta);
    }
}
