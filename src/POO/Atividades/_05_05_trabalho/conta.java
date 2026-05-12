package POO.Atividades._05_05_trabalho;

public class conta {
    private int numero;
    private String nome;
    private double saldo;

    public conta(int numero, String nome, double valor){
        this.numero = numero;
        this.nome = nome;
        this.saldo = valor;
    }

    public void deposito(double adicionar){
        saldo = saldo + adicionar;
    }

    public void saque(double remover){
        saldo = saldo - remover - 5;
    }

    public String toString(){
        return String.format("Conta: %d\nNome: %s\nSaldo: %.2f\n", numero, nome, saldo);
    }

}
