package POO.Atividades.Prova.Fatura;

public class Fatura {
    public int minutos;

    // A inteligência do cálculo mora aqui
    public double calcularValor() {
        double total = 50.0;
        if (minutos > 100) {
            total += (minutos - 100) * 2.0;
        }
        return total;
    }
}