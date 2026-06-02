package POO.Atividades.Prova.Fatura;

import java.util.Scanner;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos clientes? ");
        int n = sc.nextInt();

        double somaTotal = 0.0;

        for (int i = 0; i < n; i++) {
            Fatura f = new Fatura(); // Criamos o objeto

            System.out.print("Minutos do cliente " + (i + 1) + ": ");
            f.minutos = sc.nextInt(); // Preenchemos o atributo

            double valorPagar = f.calcularValor(); // Chamamos o cálculo
            System.out.printf("Valor a pagar: %.2f%n", valorPagar);

            somaTotal += valorPagar;
        }

        if (n > 0) {
            System.out.printf("Média das contas: %.2f%n", (somaTotal / n));
        }

        sc.close();
    }
}