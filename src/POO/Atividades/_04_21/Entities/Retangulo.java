package POO.Atividades._04_21.Entities;

public class Retangulo{
    private double Height;
    private double Width;

    public Retangulo(){
    }

    public Retangulo(double Height, double Width){
        this.Height = Height;
        this.Width = Width;
    }
    public void setHeight(double Height){
        this.Height = Height;
        //
    }
    public void setWidth(double Width){
        this.Width = Width;
    }
    public double area(){
        return Height * Width;
    }
    public double perimetro(){
        return 2 * (Width + Height);
    }
    public double diagonal() {
        return Math.sqrt((Width * Width) + (Height * Height));
    }
    public String toString(){
        return String.format("Largura= %.2f\nAltura= %.2f", Width, Height);
    }
}