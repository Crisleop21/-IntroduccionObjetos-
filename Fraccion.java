import java.util.*;

public class Fraccion {
    Scanner scanner = new Scanner(System.in);
    
    private double suma;
    private double resta;
    private double multiplicar;
    private double dividir;
    private double dato1;
    private double dato2;

    public double getDato1() {
        return dato1;
    }

    public void setDato1(double dato1) {
        this.dato1 = dato1;
    }

    public double getDato2() {
        return dato2;
    }

    public void setDato2(double dato2) {
        this.dato2 = dato2;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getResta() {
        return resta;
    }

    public void setResta(double resta) {
        this.resta = resta;
    }

    public double getMultiplicar() {
        return multiplicar;
    }

    public void setMultiplicar(double multiplicar) {
        this.multiplicar = multiplicar;
    }

    public double getDividir() {
        return dividir;
    }

    public void setDividir(double dividir) {
        this.dividir = dividir;
    }

    public Fraccion(double suma, double resta, double multiplicar, double dividir) {
        this.suma = suma;
        this.resta = resta;
        this.multiplicar = multiplicar;
        this.dividir = dividir;
    }

    public void obtenerDatos(){
        System.out.println("Escribre la primer fraccion: ");
        dato1 = scanner.nextDouble();
        System.out.println("Escribre la segunda fraccion: ");
        dato2 = scanner.nextDouble();
    }
}