package src;

import java.util.ArrayList;

/**
 * @author fsancheztemprano
 */
public abstract class Barco {
    
    protected int dias;
    protected int eslora;
    
    public float calcularAlquiler(){
        return dias * (eslora * 10);
    }

    public static void printCalculos(Barco... barcos){
        for(Barco barco : barcos){
            System.out.println(barco.calcularAlquiler() + " €");
        }
    }
    public static <E extends Barco> void printCalculos(ArrayList<E> barcos){
        for(E e : barcos){
            System.out.println(e.calcularAlquiler() + " €");
        }
    }
}
