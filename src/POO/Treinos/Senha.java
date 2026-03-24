package POO.Treinos;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int senha, chave = 2002;

        do{
            System.out.print("Digite a senha (numero inteiro/ 4 digitos / sem espaço): )");
            senha = sc.nextInt();
            if(senha != chave){
                System.out.println("Senha invalida");
            }else{
                System.out.println("Acesso permitido");
            }
        }while(senha != chave);

    }
}
