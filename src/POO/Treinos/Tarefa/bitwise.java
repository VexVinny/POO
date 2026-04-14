public static void main(String[] args) {
    int mask = 0b100000;
    int x = 65;
    int y = 5;

    if ((x & mask) != 0) {
        System.out.printf("O 7 bit do numero %d: é Verdadeiro\n", x);
    }else {
        System.out.printf("O 7 bit do numero %d: é Falso\n", x);
    }
    if((y & mask) != 0) {
        System.out.printf("O 7 bit é do numero %d: é Verdadeiro\n", y);
    }else {
        System.out.printf("O 7 bit é do numero %d: é Falso\n", y);
    }
}

