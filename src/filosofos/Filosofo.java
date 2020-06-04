/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Agus
 */
public class Filosofo extends Thread{

    private int number;
    private Cubierto izq;
    private Cubierto der;
    private boolean esUltimo;

    public Filosofo(int num, Cubierto izq, Cubierto der, boolean esUltimo) {
        number = num;
        this.izq = izq;
        this.der = der;
        this.esUltimo = esUltimo;
    }

    @Override
    public void run() {

        while (true) {
            if (this.esUltimo) {
                der.agarrar();
                //System.out.println("Filosofo " + (number + 1) + " toma cubierto der.");
                izq.agarrar();
                //System.out.println("Filosofo " + (number + 1) + " toma cubierto izq.");
                comer();
                izq.soltar();
                //System.out.println("Filosofo " + (number + 1) + " suelta cubierto izq.");
                der.soltar();
                //System.out.println("Filosofo " + (number + 1) + " suelta cubierto der.");
            } else {
                izq.agarrar();
                //System.out.println("Filosofo " + (number + 1) + " toma cubierto izq.");
                der.agarrar();
                //System.out.println("Filosofo " + (number + 1) + " toma cubierto der.");
                comer();
                izq.soltar();
                //System.out.println("Filosofo " + (number + 1) + " suelta cubierto izq.");
                der.soltar();
                //System.out.println("Filosofo " + (number + 1) + " suelta cubierto der.");
            }
        }
    }
    
    private void comer() {
            try {
                int sleepTime = ThreadLocalRandom.current().nextInt(0, 1000);
                System.out.println("Filosofo " + (number + 1) + " come por " + sleepTime);
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
        }
}
