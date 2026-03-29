package POO.Treinos.Tarefa;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int gasolina = 0, diesel = 0, alcool = 0, op;

        do{
            System.out.print("\n - - - Menu - - -\n");
            System.out.print("1 - Alcool\n2 - Gasolina\n3 - Diesel\n4 - Fim\nEscolha: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);
                    break;
            }
        }while(op != 4);
    }
}
