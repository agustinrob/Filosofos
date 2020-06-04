/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Agus
 */
public class Cubierto {

    public Semaphore mutex = new Semaphore(1);

    public void agarrar() {
        try {
            mutex.acquire(1);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }

    public void soltar() {
        mutex.release(1);
    }

    public boolean estaLibre() {
        return mutex.availablePermits() > 0;
    }
}
