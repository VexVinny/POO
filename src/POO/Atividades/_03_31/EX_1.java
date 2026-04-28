package POO.Atividades._03_31;

import java.util.Scanner;
public class EX_1 {
    void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, i;

        System.out.print("Digite um valor inteiro de 1 até 1000: ");
        x = sc.nextInt();

        if(x >= 1 && x <= 1000){
            for(i = 1; i <= x; i++){
                if(i % 2 != 0){
                    System.out.printf("= %d\n", i);
                }
            }
        }else{
            System.out.print("O valor digitado está fora do campo exigido!");
        }
    }
}
