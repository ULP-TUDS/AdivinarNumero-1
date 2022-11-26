package g10ej5;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Carlos Ferrando
 */
public class Adivinar {
    
    private int numeroRandom; 

    public Adivinar() {
        this.numeroRandom = getNumeroRandom(1, 11);
    }

    public int getNumeroRandom() {
        return numeroRandom;
    }
    
    public void adivinar(int numero){
        if (numero > numeroRandom) {
            System.out.println("El número ingresado es mayor al número a adivinar!!!");
        }else if (numero < numeroRandom){
            System.out.println("El número ingresado es menor al número a adivinar!!!");
        }
            
    }


    //genera numero random desde min al maxmimo menos uno
    private int getNumeroRandom(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
