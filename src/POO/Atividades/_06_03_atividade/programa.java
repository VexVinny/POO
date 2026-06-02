package POO.Atividades._06_03_atividade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<produtos> list = new ArrayList<>();

        String name;
        double price, taxa;
        Date data;

        System.out.print("Quantos POO.Atividades._06_03_atividade.produtos você quer cadastrar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nProduto %d\n", i + 1);
            System.out.print("Comum, POO.Atividades._06_03_atividade.usado ou POO.Atividades._06_03_atividade.importado? ");
            char op = sc.next().charAt(0);
            sc.nextLine();

            switch (op) {
                case 'c':
                    System.out.print("Nome do produto: ");
                    name = sc.nextLine();
                    System.out.print("Preço do produto: ");
                    price = sc.nextDouble();
                    list.add(new produtos(name, price));
                    break;
                case 'i':
                    System.out.print("Nome do produto: ");
                    name = sc.nextLine();
                    System.out.print("Preço do produto: ");
                    price = sc.nextDouble();
                    System.out.print("Qual o valor da taxa? ");
                    taxa = sc.nextDouble();
                    list.add(new importado(name, price, taxa));
                    break;
                case 'u':
                    System.out.print("Nome do produto: ");
                    name = sc.nextLine();
                    System.out.print("Preço do produto: ");
                    price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Qual a data de manufatura? ");
                    data = sdf.parse(sc.nextLine());
                    list.add(new usado(name, price, data));
                    break;
                default:
                    System.out.print("Opção invalida de tipo de produto!!");
                    break;
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (produtos prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}