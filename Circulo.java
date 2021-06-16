import java.util.*;
import java.math.*;


public class Circulo{
   
    Scanner scanner = new Scanner(System.in);
    private double area;
    private double perimetro;
    private double radio;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }
    public void leerRadio(){
        System.out.println("Escribre el valor del radio: ");
        radio = scanner.nextDouble();
    }
    public void calcularArea(){
        area = Math.PI*radio*radio;
    }
    public void calcularPerimetro(){
        perimetro = 2*Math.PI*radio;
    }

    public void Mostrar() {
        System.out.println("El Perimetro es:"+getPerimetro());
        System.out.println("El Area es:"+ getArea());
    }

    public Circulo(){

    }
    public static void main(String[] args) {
        Circulo circ = new Circulo();
        circ.leerRadio();
        circ.calcularArea();
        circ.calcularPerimetro();
        circ.Mostrar();
    }
}