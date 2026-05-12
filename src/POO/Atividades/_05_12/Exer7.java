package POO.Atividades._05_12;

import java.util.Scanner;

public class Exer7 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        float soma = 0, media = 0;

        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();
        float[] v = new float[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            v[i] = sc.nextInt();
            soma  += v[i];
        }
        media = soma/n;

        System.out.printf("MEDIA DO VETOR: %.3f\n", media);
        System.out.print("Valores:\n ");
        for(int i = 0; i < n; i++){
            if(v[i] < media){
                System.out.printf("%.2f\n", v[i]);
            }
        }
    }
}
