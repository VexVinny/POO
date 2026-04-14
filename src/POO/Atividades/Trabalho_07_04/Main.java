package POO.Atividades.Trabalho_07_04;

public class Main {
    public static void main(String[] args) {
        // POO.Atividades.Trabalho_07_04.Main Class

        Retangulo r = new Retangulo();
        // Criando o retangulo

        r.setWidth(3.0);
        r.setHeight(4.0);
        // Passando os valores de largura e altura


        System.out.println(r.toString());
        System.out.println("ÁREA = " + r.area());
        System.out.println("PERÍMETRO = " + r.perimetro());
        System.out.println("DIAGONAL = " + r.diagonal());
        // Uso das classes criadas no retangulo
    }
}   