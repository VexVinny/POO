package POO.Atividades._03_31;

import java.util.Scanner;
public class EX_6 {
    void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.print("Digite um valor para saber seus divisores: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.printf("%d\n", i);
            }
        }
    }

}
