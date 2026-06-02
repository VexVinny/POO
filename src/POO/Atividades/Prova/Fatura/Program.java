package POO.Atividades.Prova.Fatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nFuncionário #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();

            // Lógica para não permitir ID repetido
            while (hasId(list, id)) {
                System.out.print("Id já existe! Tente outro: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.print("\nDigite o id do funcionário que terá aumento: ");
        int idIncrease = sc.nextInt();

        // Procura o funcionário na lista pelo ID
        Employee emp = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("Este id não existe!");
        } else {
            System.out.print("Digite a porcentagem: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("\nLista de funcionários:");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    // Função auxiliar para verificar se o ID já existe na lista
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}