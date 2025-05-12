package Exercicios.E029;

public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;

    public Employee(String name, double grossSalary, double tax){
        this.Name = name;
        this.GrossSalary = grossSalary;
        this.Tax = tax;
    }

    public double netSalary(){
        return GrossSalary - Tax;
    }

    public void increaseSalary(double percentage){
        GrossSalary += GrossSalary * (percentage / 100);
    }

    public String toString(){
        return Name + ", $ " + String.format("%.2f", netSalary());
    }
}
