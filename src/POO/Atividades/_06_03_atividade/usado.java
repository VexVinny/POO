package POO.Atividades._06_03_atividade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class usado extends produtos {
    private Date data;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public usado(String name, double price, Date data) {
        super(name, price);
        this.data = data;
    }

    @Override
    public String priceTag() {
        return name + " (used) $ " + String.format("%.2f", price) + " (Manufacture date: " + sdf.format(data) + ")";
    }
}