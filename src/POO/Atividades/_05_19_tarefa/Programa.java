package POO.Atividades._05_19_tarefa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class OrderItem {
    int quantity;
    double price;
    Product product;

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    double subTotal() {
        return quantity * price;
    }
}

class Order {

    Date moment;
    OrderStatus status;
    Client client;

    OrderItem[] items = new OrderItem[100];
    int cont = 0;

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    void addItem(OrderItem item) {
        items[cont] = item;
        cont++;
    }

    double total() {
        double soma = 0;
        for (int i = 0; i < cont; i++) {
            soma += items[i].subTotal();
        }
        return soma;
    }
}

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Digite os dados do cliente:");

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Data de nascimento (DD/MM/AAAA): ");
        String birthDate = sc.nextLine();

        Client client = new Client(name, email, birthDate);

        System.out.println("\nDigite os dados do pedido:");

        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        Order order = new Order(new Date(), status, client);

        System.out.print("Quantos itens tem o pedido? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.printf("\nDigite os dados do item #%d:\n", i + 1);

            System.out.print("Nome do produto: ");
            String productName = sc.nextLine();

            System.out.print("Preco do produto: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();

            sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, productPrice, product);

            order.addItem(item);
        }
        System.out.println("\nRESUMO DO PEDIDO:");

        System.out.println("Momento do pedido: " + sdf.format(order.moment));
        System.out.println("Status do pedido: " + order.status);

        System.out.println("Cliente: " + order.client.name + " (" + order.client.birthDate + ") - " + order.client.email);

        System.out.println("Itens do pedido:");

        for (int i = 0; i < order.cont; i++) {

            System.out.println(
                    order.items[i].product.name
                            + ", $"
                            + String.format("%.2f", order.items[i].price)
                            + ", Quantidade: "
                            + order.items[i].quantity
                            + ", Subtotal: $"
                            + String.format("%.2f", order.items[i].subTotal())
            );
        }
        System.out.printf("\nPreco total: $%.2f\n", order.total());
    }
}