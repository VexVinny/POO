package POO.Atividades._05_19;

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

    String moment;
    String status;
    Client client;

    OrderItem[] items = new OrderItem[100];
    int cont = 0;

    public Order(String moment, String status, Client client) {
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

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();

        Client client = new Client(name, email, birthDate);

        System.out.println("\nEnter order data:");

        System.out.print("Status: ");
        String status = sc.nextLine();

        System.out.print("Moment: ");
        String moment = sc.nextLine();

        Order order = new Order(moment, status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.printf("\nEnter #%d item data:\n", i + 1);

            System.out.print("POO.Atividades._05_19.Product name: ");
            String productName = sc.nextLine();

            System.out.print("POO.Atividades._05_19.Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            sc.nextLine();

            Product product = new Product(productName, productPrice);

            OrderItem item = new OrderItem(quantity, productPrice, product);

            order.addItem(item);
        }

        System.out.println("\nORDER SUMMARY:");

        System.out.println("POO.Atividades._05_19.Order moment: " + order.moment);
        System.out.println("POO.Atividades._05_19.Order status: " + order.status);

        System.out.println("POO.Atividades._05_19.Client: "
                + order.client.name
                + " ("
                + order.client.birthDate
                + ") - "
                + order.client.email);

        System.out.println("\nPOO.Atividades._05_19.Order items:");

        for (int i = 0; i < order.cont; i++) {

            System.out.println(
                    order.items[i].product.name
                            + ", $"
                            + String.format("%.2f", order.items[i].price)
                            + ", Quantity: "
                            + order.items[i].quantity
                            + ", Subtotal: $"
                            + String.format("%.2f", order.items[i].subTotal())
            );
        }

        System.out.printf("\nTotal price: $%.2f\n", order.total());

        sc.close();
    }
}