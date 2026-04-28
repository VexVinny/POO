package POO.Atividades._03_31;

import java.util.Scanner;
public class EX_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int x = 1;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            x = x * i;
        }
        System.out.printf("%d\n ", x);
    }
}