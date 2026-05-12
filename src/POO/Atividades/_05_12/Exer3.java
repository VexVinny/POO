package POO.Atividades._05_12;

import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        float[] altura = new float[n];

        float altMedia = 0, per16 = 0;
        int cont16 = 0;

        for (int i = 0; i < n; i++) {

            System.out.printf("Dados da %dº pessoa:\n", i + 1);

            System.out.print("Nome: ");
            nome[i] = sc.next();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            System.out.print("Altura: ");
            altura[i] = sc.nextFloat();

            altMedia += altura[i];

            if (idade[i] < 16) {
                cont16++;
            }
        }

        altMedia = altMedia / n;
        per16 = (float) cont16 * 100 / n;

        System.out.printf("\nAltura média: %.2f\n", altMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", per16);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }

    }
}