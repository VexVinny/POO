package POO.Atividades._05_05_trabalho;

import java.util.Scanner;

public class programa {
    static void main(String[] args){
        double valor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o numero da conta? ");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.print("Qual o nome do titular conta?");
        String nome = sc.nextLine();
        System.out.print("Deseja fazer deposito inicial? (s/n) ");
        char op = sc.next().charAt(0);
        conta c;
        if(op == 's'){
            System.out.print("Qual o deposito inicial? ");
            valor = sc.nextDouble();
            c = new conta(conta, nome, valor);
        }else{
            valor = 0;
            c = new conta(conta, nome, valor);
        }

        System.out.print(c.toString());

        System.out.print("Deposito: ");
        double adicionar = sc.nextDouble();
        c.deposito(adicionar);

        System.out.print(c.toString());

        System.out.print("Saque: ");
        double remover = sc.nextDouble();
        c.saque(remover);

        System.out.print(c.toString());


    }
}
