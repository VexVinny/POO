package POO.Atividades._04_21.Application;

import POO.Atividades._04_21.Entities.aluno;

import java.util.Scanner;
public class Exer3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        for(int i = 0; i < 3; i++){
            System.out.printf("Nota %d:", i+1);
            notas[i] = sc.nextDouble();
        }

        aluno A1 = new aluno(nome, notas);

        System.out.printf("FINAL GRADE = %.2f%n", A1.notaFinal());

        if (A1.notaFinal() >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", A1.pontosFaltantes());
        }

    }
}
