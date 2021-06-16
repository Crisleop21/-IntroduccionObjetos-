import java.util.*;

public class Contador{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contador cont = new Contador();
        int num;
        System.out.println("Ingrese un numero donde desea iniciar el contador");
        num = scanner.nextInt();
        
        //asignamos el valor al contador
        cont.SetContador(num);
        //incrementamos el contador
        cont.incrementar();
        System.out.println("Mostrar Incremento "+cont.GetCont());
        

        //mostrar decremento
        cont.decrementar();
        cont.decrementar();
        System.out.println("Mostrar Decremento "+cont.GetCont());
        
    }
    
    private int cont;
    //construcctor por defecto
    public Contador(){

    }
    //constructor con parametros
    public Contador(int cont){
        if (cont < 0 ) {
            this.cont = 0;            
        } else {
            this.cont = cont;
        }   
    }
    //contador copia
    public Contador(final Contador z){
        cont = z.cont;
    }
    //metodo setter establecemos contador
    public void SetContador(int cont){
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    
    //metodo getter mostramos contador
    public int GetCont(){
        return cont;
    }
    //metodo incrementar
    public void incrementar(){
        cont++;
    }

    //metodo decrementar
    public void decrementar(){
        cont--;
        if (cont < 0) {
            cont = 0;
        }
    }

}
