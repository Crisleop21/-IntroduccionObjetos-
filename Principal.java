/*package src;
import src.Cuadrado;
import src.Rectangulo;*/

public  class Principal{
    public static void main(String[] args) {
        Principal prin = new Principal();
    }
     public Principal(){
        
        System.out.println("CONTADOR");
        Contador contador = new Contador(5);
        Contador contador2 = contador;
        contador2.SetContador(4);
        contador2.decrementar();
        contador2.incrementar();

        System.out.println("\nCuadrado");
        Cuadrado cuadrado = new Cuadrado();
        Cuadrado cuadrado2 = cuadrado;
        System.out.println("El lado es: "+cuadrado2.getLado());
        cuadrado2.setLado(7);
        System.out.println("El lado cambia a: "+cuadrado2.getLado());
        cuadrado.Area();
        cuadrado.Perimetro();
        cuadrado.Mostrar();

        System.out.println("\nRectangulo");
        Rectangulo rectangulo = new Rectangulo(9,5);
        Rectangulo rectangulo2 = rectangulo;
        System.out.println("La altura del rectangulo es: "+rectangulo2.getAltura()+" y la base es"+rectangulo.getBase());
        rectangulo2.setAltura(7);
        rectangulo2.setBase(3);
        System.out.println("Los lados cambian : "+rectangulo2.getAltura()+" y la base es"+rectangulo.getBase());
        rectangulo.CalcularArea();
        rectangulo.calcularPerimetro();
        rectangulo.Mostrar();

        System.out.println("\nCirculo");
        Circulo circ = new Circulo();
        Circulo circ2 = circ;
        System.out.println("El radio es: "+circ2.getRadio());
        circ2.setRadio(14);
        System.out.println("El area es: "+circ2.getArea());
        System.out.println("El perimetro es: "+circ2.getPerimetro());
        circ.calcularArea();
        circ.calcularPerimetro();
        circ.Mostrar();


        System.out.println("\nLIBRO");
        Libro lib = new Libro(0, "El Arte de la Guerra", "Sun Tzu", 1);
        Libro lib2 = lib;
        System.out.println("Antes de hacer los cambios");
        lib2.setAutor("Homero");
        lib2.setEjemplares(1);
        lib2.setPrestados(0);
        lib.setTitulo("La Ilíada ");
        System.out.println("Despues de hacer los cambios");
        
        System.out.println("\nFraccion");
        Fraccion frac = new Fraccion();
        Fraccion frac2 = frac;
        System.out.println("El primer dato es "+frac2.getDato1()+"El segundo dato es: "+frac2.getDato2());
        frac.calcularDivision();
        frac.calcularMultiplicacion();
        frac.calcularResta();
        frac.calcularSuma();
        frac.Mostrar();

     }

}