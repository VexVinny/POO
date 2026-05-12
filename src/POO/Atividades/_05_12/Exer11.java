package POO.Atividades._05_12;
import java.util.Scanner;

public class Exer11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        double menorAltura, maiorAltura;
        double somaMulheres = 0, mediaMulheres;
        int contMulheres = 0, contHomens = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %dº pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %dº pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }
        menorAltura = altura[0];
        maiorAltura = altura[0];

        for (int i = 0; i < n; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
            if (genero[i] == 'F' || genero[i] == 'f') {
                somaMulheres += altura[i];
                contMulheres++;
            } else {
                contHomens++;
            }
        }
        mediaMulheres = somaMulheres / contMulheres;

        System.out.printf("\nMenor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaMulheres);
        System.out.printf("Numero de homens = %d\n", contHomens);
    }
}