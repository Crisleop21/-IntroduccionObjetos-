import java.util.*;

public class Cuadrado{

    
    Scanner scanner = new Scanner (System.in);
    private double Lado;
    private double Perimetro;
    private double Area;
   
    public Cuadrado(double Lado, double Perimetro, double Area) {
        this.Lado = Lado;
        this.Perimetro = Perimetro;
        this.Area = Area;
    }

    public double getLado() {
        return Lado;
    }

    public void setLado(double Lado) {
        this.Lado = Lado;
    }

    public double getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(double Perimetro) {
        this.Perimetro = Perimetro;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    
    public void leerLado() { 
        System.out.println("Escribre el valor de los lados:");
        Lado = scanner.nextDouble();
    }

    public void Perimetro() {
        Perimetro = 4*Lado;
    }

    public void Area() {
        Area = Math.pow(Lado,2);
    }

    public void Mostrar() {
        System.out.println("Valor de los Lados:" + Lado);
        System.out.println("El Perimetro es:"+ Perimetro);
        System.out.println("El Area es:"+ Area);
    }

    public Cuadrado(){
        
    }
    public static void main(String[] args) {
        
        Cuadrado C = new Cuadrado();
        C.leerLado();
        C.Perimetro();
        C.Area();
        C.Mostrar();     
        
    }

}