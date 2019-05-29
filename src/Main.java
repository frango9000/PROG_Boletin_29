package src;

import java.util.ArrayList;

/**
 * @author fsancheztemprano
 */
public class Main {
    public static void main(String[] args) {
        

        Barco b1 = new Velero(10, 2);
        Barco b2 = new Deportivos(5, 3);
        Barco b3 = new Yates(30, 300, 3);
        ArrayList<Barco> barcos = new ArrayList<>();
        barcos.add(b1);
        barcos.add(b2);
        barcos.add(b3);
        Barco.printCalculos(barcos);
        
        

    }
}