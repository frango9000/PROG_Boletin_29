package src;
/**
 * @author fsancheztemprano
 */
public class Main {
    public static void main(String[] args) {
        

        Velero b1 = new Velero(10, 2);
        Barco b2 = new Deportivos(5, 3);
        Barco b3 = new Yates(30, 300, 3);
        
        Barco.printCalculos(b1,b2,b3);
        

    }
}