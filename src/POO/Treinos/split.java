package POO.Treinos;

public class split {
    public static void main(String[] args){
        String palavra = "PARAlelePIpeDO ";
        String sn1 = palavra.toLowerCase();

        System.out.printf("String minuscula: %s\n", sn1);
        String sn2 = palavra.toUpperCase();
        System.out.printf("String maiuscula: %s\n", sn2);

        String sn3 = palavra.replace("l", "e");
        System.out.printf("String trocada: %s\n", sn3);

        String sn4 = palavra.substring(2, 9);
        System.out.printf("String numeros sla: %s\n", sn4);

        String sn5 = palavra.trim();
        System.out.printf("String alguma coisa: %s\n", sn5);
    }
}
