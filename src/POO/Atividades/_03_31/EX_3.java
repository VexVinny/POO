package POO.Atividades._03_31;

import java.util.Scanner;
public class EX_3 {
    void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        float a, b, c, media;

        System.out.print("Quantos casos deseja testar: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            System.out.print("Digite valores com 1 casa decimal (1/3): ");
            a = sc.nextFloat();
            System.out.print("Digite valores com 1 casa decimal (2/3): ");
            b = sc.nextFloat();
            System.out.print("Digite valores com 1 casa decimal (3/3): ");
            c = sc.nextFloat();

            media = ((a*2) + (b*3) + (c*5)) / 10;
            System.out.printf("media = %.1f\n", media);
        }

    }
}
