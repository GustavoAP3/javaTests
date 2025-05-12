package Exercicios.E028;

public class Rectangle {
    public double Width;
    public double Height;

    public Rectangle(double width, double height){
        this.Width = width;
        this.Height = height;
    }

    public double Area(){
        return Width * Height;
    }

    public double Perimeter(){
        return 2 * (Width + Height);
    }

    public double Diagonal(){
        return Math.sqrt((Width * Width) + (Height * Height));
    }
}
