package src;
/**
 * @author fsancheztemprano
 */
public class Deportivos extends Barco{

    protected int cv;

    public Deportivos(int dias, int cv) {
        this.cv = cv;
        super.dias = dias; 
    }
    
    @Override
    public float calcularAlquiler() {
        return super.calcularAlquiler() + (2 * cv);
    }

}
