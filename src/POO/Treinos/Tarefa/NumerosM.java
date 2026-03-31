import java.util.Scanner;
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x, y, z;
    x = sc.nextInt();
    y = sc.nextInt();
    z = sc.nextInt();
    if(x == y && y == z) {
        System.out.printf("São todos iguais: %d\n", x);
    }else if(x == y){
        System.out.printf("o valor de X e Y são iguais: %d\n", x);
    }else if(x == z){
        System.out.printf("O valor de X e Z são iguais: %d\n", x);
    }else if(y == z){
        System.out.printf("O valor de Y e Z são iguais: %d\n", y);
    }else{
        System.out.println("São todos diferentes!");
    }
    if(x < y & x < z){
        System.out.printf("O %d é o menor\n", x);
    }else if(y < z){
        System.out.printf("O %d é o menor\n", y);
    }else{
        System.out.printf("O %d é o menor\n", z);
    }
}

