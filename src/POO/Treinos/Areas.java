package POO.Treinos;

import java.util.Scanner;

public class Areas {
    double b, B, h, area;

    Scanner sc = new Scanner(System.in);
    void main(){
        System.out.println("- - - Calculo da area de um trapezio - - -");
        System.out.print("Digite o valor da base menor (b): ");
        b = sc.nextDouble();
        System.out.print("Digite o valor da base maior (B): ");
        B = sc.nextDouble();
        System.out.print("Digite o valor da altura (h): ");
        h = sc.nextDouble();

        area = (b + B) / 2.0 * h;

        System.out.printf("\nO valor da area desse trapezio é: %.2f\n", area);
    }

}
