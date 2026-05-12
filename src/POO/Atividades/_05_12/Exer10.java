package POO.Atividades._05_12;
import java.util.Scanner;

public class Exer10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos alunos serao digitados? ");
        n = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            nome[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nAlunos aprovados:");

        for (int i = 0; i < n; i++) {
            double media = (nota1[i] + nota2[i]) / 2;
            if (media >= 6.0) {
                System.out.println(nome[i]);
            }
        }
    }
}