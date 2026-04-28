package POO.Atividades._04_21.Entities;

public class funcionario {
    private String nome;
    private double sal_bruto;
    private double tax;


    public funcionario(String nome, double sal_bruto, double tax){
        this.nome = nome;
        this.sal_bruto = sal_bruto;
        this.tax = tax;
    }

    public double NetSalary(){
        return sal_bruto - tax;
    }

    public void IncreaseSalary(double per){
        this.sal_bruto += sal_bruto * (per/100);
    }

    public  String toString(){
        return nome + ", $" + String.format("%.2f\n", NetSalary());
    }


}