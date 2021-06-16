import java.util.*;

public class Cuadrado{
    public static void main(String[] args) {
        
        Cuadrado C = new Cuadrado();
        C.leerLado();
        C.Perimetro();
        C.Area();
        C.Mostrar();     
        
    }

    Scanner scanner = new Scanner (System.in);
    private double Lado;
    private double Perimetro;
    private double Area;

    public Cuadrado() {
        Lado = 0;
        Perimetro = 0;
        Area = 0;
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


}