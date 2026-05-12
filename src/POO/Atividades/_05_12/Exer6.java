package POO.Atividades._05_12;
import java.util.Scanner;

public class Exer6 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];

        System.out.print("Digite os valores de A\n");
        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            A[i] = sc.nextInt();
        }
        System.out.print("Digite os valores de B:\n");
        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            B[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            C[i] = A[i] + B[i];
        }

        System.out.print("VALOR RESULTANTE:\n");
        for(int i = 0; i < n; i++){
            System.out.printf("%d\n", C[i]);
        }
    }
}
