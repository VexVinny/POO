package POO.Atividades._31_03;

import java.util.Scanner;
public class EX_2 {
    void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x, n, i, in = 0, out = 0;

        System.out.print("Digite a quantidade de numeros que deseja escrever: ");
        n = sc.nextInt();

        for(i = 0; i < n; i++){
            System.out.printf("Digite o Valor (%d/%d): ", i + 1, n);
            x = sc.nextInt();
            if(x > 10 && x < 20){
                in++;
            }else{
                out++;
            }
        }

        System.out.printf("%d in\n%d out\n", in, out);
    }
}
