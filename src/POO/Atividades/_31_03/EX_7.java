package POO.Atividades._31_03;

import java.util.Scanner;
public class EX_7 {
    void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, i, q, c;

        System.out.print("Digite um numero inteiro: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            q = i * i;
            c = i * i * i;
            System.out.printf("%d   %d   %d\n", i, q, c);
        }
    }
}
