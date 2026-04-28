package POO.Atividades._04_21.Entities;

public class aluno {
    public String nome;
    public double[] notas = new double[3];

    public aluno(String nome, double notas[]){
        this.nome = nome;
        this.notas = notas;
    }

    public double notaFinal(){
        return notas[0] + notas[1] + notas[2];
    }

    public double pontosFaltantes() {
        if (notaFinal() < 60.0) {
            return 60.0 - notaFinal();
        }
        return 0.0;
    }
}
