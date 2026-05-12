package POO.Atividades._05_12;
import java.util.Scanner;

public class Exer1 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, x;
        int[] v = new int[10];

        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            v[i] = sc.nextInt();
        }

        System.out.print("NUMEROS NEGATIVOS:\n");
        for(int i = 0; i < n; i++){
            if(v[i] < 0){
                System.out.printf("%d\n", v[i]);
            }
        }
    }
}
