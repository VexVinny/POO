package POO.Treinos;

public class classes {
    public static void main(String[] args) {
        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        for (int i = 0; i < 3; i++) {
            System.out.printf("%s\n", vect[i]);
        }
    }
}
