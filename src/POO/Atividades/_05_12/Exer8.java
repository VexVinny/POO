package POO.Atividades._05_12;
import java.util.Scanner;

public class Exer8 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, cont = 0;
        float soma = 0, media = 0;

        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();
        int[] v = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            v[i] = sc.nextInt();
            if((v[i] % 2) == 0){
                soma += v[i];
                cont++;
            }
        }
        media = soma/cont;

        if(cont > 0){
            System.out.printf("MEDIA DOS PARES: %.1f\n", media);
        }else{
            System.out.print("NENHUM NUMERO PAR\n");
        }


    }
}
