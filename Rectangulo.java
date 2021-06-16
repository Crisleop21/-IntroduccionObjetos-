import java.util.*;

public class Rectangulo {
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    Scanner scanner = new Scanner(System.in);

    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

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

    public Rectangulo(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    
    public void CalcularArea(){
        area = (base*altura);
    }
    public void calcularPerimetro(){
        perimetro = base+base+altura+altura;
    }
    
    public void leerBase() { 
        System.out.println("Escribre el valor de la base: ");
        base = scanner.nextDouble();
    }
    public void leerAltura() { 
        System.out.println("Escribre el valor de la altura: ");
        altura = scanner.nextDouble();
    }

    public void Mostrar() {
        System.out.println("El Perimetro es:"+getPerimetro());
        System.out.println("El Area es:"+ getArea());
    }

    public Rectangulo(){

    }
   
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo();
        rec.leerAltura();
        rec.leerBase();
        rec.calcularPerimetro();;
        rec.CalcularArea();;
        rec.Mostrar(); 
    }
    
}
