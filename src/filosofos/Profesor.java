/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JFrame;

/**
 *
 * @author Agus
 */

public class Profesor extends Thread {
    public  final static int THINKING=0;
    public final static int HUNGRY=1;
    public final static int EATING=2;
    
    private int number;
    private Lapiz izq;
    private Lapiz der;
    private boolean esUltimo;
    private String nombre;
    private int status;
    private MainFram mainFram;

    public Profesor(int num, Lapiz izq, Lapiz der, boolean esUltimo, String nombre, MainFram frame) {
        number = num;
        this.izq = izq;
        this.der = der;
        this.esUltimo = esUltimo;
        this.nombre = nombre;
        this.status = THINKING;
        mainFram = frame;
    }

    @Override
    public void run() {

        while (true) {
            statusShow();
            if (this.esUltimo) {
                der.agarrar();
                status = HUNGRY;
                izq.agarrar();
                status = EATING;
                evaluar();
                izq.soltar();
                der.soltar();
                status = THINKING;
            } else {
                izq.agarrar();
                status = HUNGRY;
                der.agarrar();
                status = EATING;
                evaluar();
                izq.soltar();
                der.soltar();
                status = THINKING;
            }
        }
    }
    
    void statusShow() {
      if(status==THINKING)
      {
          this.mainFram.setPosition(this.number,THINKING);
          
      }
      else if(status==EATING)
      {
         this.mainFram.setPosition(this.number,EATING);
          
      }
      else 
      {
          this.mainFram.setPosition(this.number,HUNGRY);
      }
        
       // mf.setPosition(i);
    }


    private void evaluar() {
        try {
            int sleepTime = ThreadLocalRandom.current().nextInt(0, 10000);
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
