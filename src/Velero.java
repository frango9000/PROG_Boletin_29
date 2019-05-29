package src;
/**
 * @author fsancheztemprano
 */
public class Velero extends Barco{
    
    protected int mastiles;
    
    public Velero(int dias, int mastiles) {
        this.mastiles = mastiles;
        super.dias = dias; 
    }
    
    @Override
    public float calcularAlquiler() {
        return super.calcularAlquiler() + (8* mastiles);
    }

}
