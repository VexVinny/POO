package POO.Treinos.Tarefa;

import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float x, y;
        int vef = 0, cont;

        do{
            System.out.print("Digite os pontos do plano Cartesiano\nX: ");
            x = sc.nextFloat();
            System.out.print("Y = ");
            y = sc.nextInt();
            if(x == 0 || y == 0){
                vef = 1;
            }else{
                if(x > 0 && y > 0){
                    System.out.println("Primeiro");
                }else if(x < 0 && y > 0){
                    System.out.println("Segundo");
                }else if(x < 0 && y < 0){
                    System.out.println("Terceiro");
                }else{
                    System.out.println("Quarto");
                }
            }
        }while(vef != 1);

    }
}
