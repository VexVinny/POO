package POO.Treinos;

import java.util.Scanner;

public class Planos {

    Scanner sc = new Scanner(System.in);
    void main(){
        float minutos, limite;
        float pagar = 0;
        char plano;


        System.out.print("Qual o seu plano?\nb - Plano Basico\np - Plano Plus\nEscolha: ");
        plano = sc.next().charAt(0);

        if(plano != 'b' && plano != 'p'){
            System.out.print("Plano invalido!!\nFechando Sistema...\n....");
        }else{
            if(plano == 'b'){
                System.out.print("Quantos minutos você ligou? ");
                minutos = sc.nextFloat();
                if(minutos <= 100){
                    pagar = 50;
                }else if (minutos > 100){
                    limite = minutos - 100;
                    limite = limite * 2;
                    pagar = 50 + limite;
                }
            }else{
                System.out.print("Quantos minutos você ligou? ");
                minutos = sc.nextFloat();
                if(minutos <= 300){
                    pagar = 100;
                }else if(minutos > 300){
                    limite = minutos - 300;
                    pagar = 100 + limite;
                }
            }
            System.out.printf("O Total a pagar é: %f", pagar);
        }
    }
}
