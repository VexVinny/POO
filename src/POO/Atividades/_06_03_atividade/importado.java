package POO.Atividades._06_03_atividade;

public class importado extends produtos {
    private double taxa;

    public importado(String name, double price, double taxa) {
        super(name, price);
        this.taxa = taxa;
    }

    public double totalPrice() {
        return price + taxa;
    }

    @Override
    public String priceTag() {
        return name + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", taxa) + ")";
    }
}