package POO.Atividades._05_12;
import java.util.Scanner;

public class Exer4 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, cont = 0;

        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();
        int[] v = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            v[i] = sc.nextInt();
        }

        System.out.print("NUMEROS PARES: ");
        for(int i = 0; i < n; i++){
            if((v[i] % 2) == 0){
                System.out.printf("%d    ", v[i]);
                cont++;
            }
        }
        System.out.print("\n");
        System.out.printf("QUANTIDADE DE PARES = %d\n", cont);
    }
}
