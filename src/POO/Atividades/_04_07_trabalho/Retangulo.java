package POO.Atividades._04_07_trabalho;

public class Retangulo {
    private double Height;
    private double Width;

    /* Criação da classe com valores definidos como "private", assim esses valores não
    podem ser acessados diretamente, apenas atraves das funções, sendo esses valores
    passados como parametros. */

    public Retangulo(){
        // Necessario para poder criar o objeto sem informar seus dados no momento da criação.
    }

    public Retangulo(double Height, double Width){
        this.Height = Height;
        this.Width = Width;
        // Necessario para podermos acessar as funções definidas como "private".
    }
    public void setHeight(double Height){
        this.Height = Height;
        // Função para poder passar o valor da altura.
    }
    public void setWidth(double Width){
        this.Width = Width;
        // Função para poder passar o valor da largura.
    }
    public double area(){
        return Height * Width;
        // Calculo da area do retangulo.
    }
    public double perimetro(){
        return 2 * (Width + Height);
        // Calculo do perímetro do retangulo.
    }
    public double diagonal() {
        return Math.sqrt((Width * Width) + (Height * Height));
        // Calculo da diagonal do retangulo.
    }
    public String toString(){
        return String.format("Largura= %.2f\nAltura= %.2f", Width, Height);
        // Padrão da string na função, mostrando os valores da largura e da altura.
    }
}