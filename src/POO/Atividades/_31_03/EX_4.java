package POO.Atividades._31_03;

import java.util.Scanner;
public class EX_4 {
    void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n, i;
        float x, y, div;

        System.out.print("Quantas vezes quer dividir? ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            System.out.print("Digite 2 valores para a divisão: ");
            x = sc.nextFloat();
            y = sc.nextFloat();
            if(y == 0){
                System.out.print("Não é possivel dividir por 0!\n");
            }else{
                div = x / y;
                System.out.printf("%.2f\n", div);
            }
        }
    }
}
