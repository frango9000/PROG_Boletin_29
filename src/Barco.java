package src;
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
}
