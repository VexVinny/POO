package POO.Atividades._04_21.Application;

import POO.Atividades._04_21.Entities.funcionario;

import java.util.Scanner;
import java.util.Locale;

public class Exer2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Salario Bruto: ");
        double sal_bruto = sc.nextDouble();
        System.out.print("Taxa: ");
        double tax = sc.nextDouble();


        funcionario F = new funcionario(nome, sal_bruto, tax);

        System.out.printf("\n Funcionario:" + F);

        System.out.print("Qual a porcentagem de aumento do salario: ");
        double per = sc.nextDouble();

        F.IncreaseSalary(per);

        System.out.println();
        System.out.println("Salario atualizado: " + F);

        sc.close();


    }
}
