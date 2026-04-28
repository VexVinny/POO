package POO.Atividades._03_24;

import  java.util.Scanner;

public class if_else{
    Scanner sc = new Scanner(System.in);
    void main(){
        int op, a, b;
        float x, y;

        do {
            menu();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Qual numero deseja saber se é positivo ou negativo? ");
                    x = sc.nextFloat();
                    Ver_posi(x);
                    break;
                case 2:
                    System.out.print("Qual numero deseja saber se é par ou impar? ");
                    a = sc.nextInt();
                    Ver_par(a);
                    break;
                case 3:
                    System.out.print("para saber se são multiplos digite:\nNumero 1: ");
                    a = sc.nextInt();
                    System.out.print("Numero 2: ");
                    b = sc.nextInt();
                    multiplos(a,b);
                    break;
                case 4:
                    System.out.print("Horas de um jogo: min 1h / max 24h\nUsar sistema 24h\nQual a hora que iniciou o jogo? )");
                    a = sc.nextInt();
                    System.out.print("Qual a hora que terminou o jogo? ");
                    b = sc.nextInt();
                    jogo(a,b);
                    break;
                case 5:
                    lanches();
                    break;
                case 6:
                    System.out.print("Achar o intervalo em que ele se encontra ([0,25],[25,50],[50,75],[75,100])\nDigite:");
                    a = sc.nextInt();
                    intervalo(a);
                    break;
                case 7:
                    System.out.print("digite 2 valores referentes ao eixo X e Y do plano cartesiano (com 1 casa decimal)\n");
                    System.out.print("Valor de X: ");
                    x = sc.nextFloat();
                    System.out.print("Valor de Y: ");
                    y = sc.nextFloat();
                    cartsiano(x,y);
                    break;
                case 8:
                    System.out.print("Digite o salario para calcular a Taxa (2 casas decimais): ");
                    x = sc.nextFloat();
                    taxas(x);
                    break;
                case 0:
                    System.out.print("Fechando Programa...\n....");
                    break;
                default:
                    System.out.print("Numero Invalido!!!\nDigite um numero do menu ou 0 para sair!!!\n");
            }
        }while(op != 0);
    }
    void menu(){
        System.out.print("\n- - - Menu - - -\n");
        System.out.print("\n1 - Verificar se é positivo ou negativo\n2 - Verificar se par ou impar\n3 - Verificar se são multiplos\n" +
                "4 - Calcular duração de um jogo\n5 - Calculo preço de lanches\n6 - Verificar em qual intervalo o numero está\n" +
                "7 - quadrante do plano cartesiano\n8 - Calculo de Taxas\n0 - Sair\n");
        System.out.print("\nEscolha: ");
    }

    void Ver_posi(float x){
        if(x >= 0){
            System.out.println("O numero é Positivo");
        }else{
            System.out.println("O numero é Negativo");
        }
    }

    void Ver_par(int a){
        if(a % 2 == 0){
            System.out.println("O Numero é par");
        }else{
            System.out.println("O numero é impar");
        }
    }

    void multiplos(int a, int b){
        int temp;
        if(b > a){
            temp = a;
            a = b;
            b = temp;
        }
        if(a % b == 0){
            System.out.println("Os numeros são multiplos!");
        }else{
            System.out.println("Os numeros não são Multiplos!");
        }
    }

    void jogo(int a, int b){
        int horas;
        if(a > b){
            horas = (24 - a) + b;
            System.out.printf("O Jogo durou %d horas\n", horas);
        }else if (b > a){
            horas = b - a;
            System.out.printf("O jogo durou %d horas\n", horas);
        }else{
            System.out.print("O jogo durou 24 horas\n");
        }
    }

    void lanches(){
        int op2, qtd = 0;
        double preco;

        System.out.println("Qual o Lanche você deseja? ");
        System.out.print("1 - Cachorro Quente\n2 - X-Salada\n3 - X-Bacon\n4 - Torrada simples\n5 - Refrigerante\n0 - Sair\nEscolha: ");
        op2 = sc.nextInt();
        if(op2 != 0){
            System.out.print("Qual a quantidade? ");
            qtd = sc.nextInt();
        }
        switch (op2) {
            case 1:
                preco = 4 * qtd;
                System.out.printf("O total é %.2f\n", preco);
                break;
            case 2:
                preco = 4.5 * qtd;
                System.out.printf("O total é %.2f\n", preco);
                break;
            case 3:
                preco = 5 * qtd;
                System.out.printf("O total é %.2f\n", preco);
                break;
            case 4:
                preco = 2 * qtd;
                System.out.printf("O total é %.2f\n", preco);
                break;
            case 5:
                preco = 1.5 * qtd;
                System.out.printf("O total é %.2f\n", preco);
                break;
            case 0:
                System.out.print("Saindo da tabela...\n....\n");
                break;
        default:
            System.out.print("Numero invaliddo!!\n");
            break;
        }
    }

    void intervalo(float x) {
        if (x < 0 || x > 100) {
            System.out.print("O numero está fora dos intervalos!!\n");
        } else if (x >= 0 && x <= 25) {
            System.out.print("O numero está no intervalo de [0,25]\n");
        } else if (x > 25 && x <= 50) {
            System.out.print("O numero está no intervalo de [25,50]\n");
        } else if (x > 50 && x <= 75) {
            System.out.print("O numero está no intervalo de [50,75]\n");
        }else{
            System.out.print("O numero está no intervalo de [75,100]\n");
        }
    }

    void cartsiano(float x, float y){
        if(x == 0 && y == 0){
            System.out.print("Origem!\n");
        }else if(x == 0){
            System.out.print("Eixo X\n");
        }else if(y == 0){
            System.out.print("Eixo Y\n");
        }else if(x > 0 && y > 0){
            System.out.print("Quadrante 1\n");
        }else if(x < 0 && y > 0){
            System.out.print("Quadrante 2\n");
        }else if(x < 0 && y < 0){
            System.out.print("Quadrante 3\n");
        }else if(x > 0 && y < 0){
            System.out.print("Quadrante 4\n");
        }
    }

    void taxas(float x){
        float valor = 0;
        float tx = 0;
        if(x >= 0 && x <= 2000){
            System.out.print("Isento\n");
        }else if(x > 4500){
            tx = x - 4500;
            tx = (float) (tx * 0.28);
            valor = 80 + 270 + tx;
            System.out.printf("valor: %.2f\n", valor);
        }else if(x > 3000.01){
            tx = (float) (x - 3000.01);
            tx = (float) (tx * 0.18);
            valor = tx + 80;
            System.out.printf("valor: %.2f\n", valor);
        }else if(x > 2000.01){
            tx = x - 2000;
            tx = (float) (tx * 0.08);
            valor = tx;
            System.out.printf("valor: %.2f\n", valor);
        }
    }
}