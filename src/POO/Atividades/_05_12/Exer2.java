package POO.Atividades._05_12;
import java.util.Scanner;

public class Exer2 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        float soma = 0, media = 0;

        System.out.print("Quantos numeros você vai digitar?");
        n = sc.nextInt();
        int[] v = new int[n];


        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            v[i] = sc.nextInt();
            soma  += v[i];
        }
        media = soma/n;

        System.out.print("Valores: ");
        for(int i = 0; i < n; i++){
            System.out.printf("%d    ", v[i]);
        }
        System.out.print("\n");
        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Media: %.2f\n", media);
    }
}
