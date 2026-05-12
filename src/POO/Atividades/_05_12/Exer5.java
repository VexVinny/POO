package POO.Atividades._05_12;

import java.util.Scanner;

public class Exer5 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, maior = 0, pos = 0;

        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();
        int[] v = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            v[i] = sc.nextInt();
            if(v[i] > maior){
                maior = v[i];
                pos = i;
            }
        }

        System.out.printf("MAIOR VALOR = %d\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", pos);
    }
}
