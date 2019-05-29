package src;
/**
 * @author fsancheztemprano
 */
public class Yates extends Barco{
    protected int cv;
    protected int camarotes;

    public Yates(int dias, int cv, int camarotes) {
        this.cv = cv;
        super.dias = dias; 
    }
    
    @Override
    public float calcularAlquiler() {
        return super.calcularAlquiler() + (2 * cv) + (25*camarotes);
    }
}
