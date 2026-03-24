package POO.Treinos;

import java.util.Scanner;

public class Op_Aritimetico {
    void main(){
        Scanner sc = new Scanner(System.in);
        float x, y;
        float resto, div;
        System.out.print("escolha um numero para ser dividido: ");
        x = sc.nextInt();
        System.out.print("escolha um numero para dividir: ");
        y = sc.nextInt();

        System.out.println("\n");
        do{
            System.out.printf("Faremos: %.2f / %.2f\n", x, y);
            div = x / y;
            resto = x % y;
            x = div;

            System.out.printf("A divisão é %.2f\n", div);
            System.out.printf("O resto é: %.2f\n\n", resto);
        }while(x > y);
        System.out.printf("Não é mais possivel dividir!!\n\n");

        System.out.printf("Fim do Sistema!!\n\n");

    }
}
