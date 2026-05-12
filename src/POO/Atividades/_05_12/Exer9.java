package POO.Atividades._05_12;
import java.util.Scanner;

public class Exer9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        int maiorIdade = 0;
        String pessoaMaisVelha = "";

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %dº pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            if (i == 0 || idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                pessoaMaisVelha = nome[i];
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s\n", pessoaMaisVelha);
    }
}