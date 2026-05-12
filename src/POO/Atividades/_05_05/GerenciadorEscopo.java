package POO.Atividades._05_05;

public class GerenciadorEscopo {

    // 1. ESCOPADA DE INSTÂNCIA (Atributo)
    // Alocada quando o objeto é criado (new).
    // Desalocada apenas quando o Garbage Collector remove o objeto da memória.
    String status = "Ativo";

    public void executarTeste(int parametro) {
        // 2. ESCOPO LOCAL (Variável de Método)
        // Alocada ao entrar no método. Desalocada ao sair dele.
        int somaLocal = parametro + 10;



        if (somaLocal > 15) {
            // 3. ESCOPO DE BLOCO
            // Esta variável 'mensagem' só existe dentro das chaves deste 'if'.
            String mensagem = "Valor acima do limite!";
            System.out.println(mensagem);
            System.out.println("Status atual: " + status); // Acessa instância
        }

        // System.out.println(mensagem); // ERRO DE COMPILAÇÃO!
        // A variável 'mensagem' já foi "desalocada" do escopo de bloco.

        System.out.println("Soma local ainda existe: " + somaLocal);
    }

    public static void main(String[] args) {
        GerenciadorEscopo exemplo = new GerenciadorEscopo();
        exemplo.executarTeste(20);

        // Ao terminar o main, 'exemplo' perde a referência e o Garbage Collector
        // poderá liberar a memória de todo o objeto.
    }
}


