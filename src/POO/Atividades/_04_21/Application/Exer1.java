package POO.Atividades._04_21.Application;

import POO.Atividades._04_21.Entities.Retangulo;

public class Exer1 {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();

        r.setWidth(3.0);
        r.setHeight(4.0);

        System.out.println(r.toString());
        System.out.println("ÁREA = " + r.area());
        System.out.println("PERÍMETRO = " + r.perimetro());
        System.out.println("DIAGONAL = " + r.diagonal());
    }
}   