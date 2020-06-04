package filosofos;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static int cant = 5;
    static Filosofo filosofos[] = new Filosofo[cant];
    static Cubierto cubiertos[] = new Cubierto[cant];

    public static void main(String argv[]) {
        
        for (int i = 0; i < cant; i++) {
            cubiertos[i] = new Cubierto();
        }

        for (int i = 0; (i < cant); i++) {
            filosofos[i] = new Filosofo(i, cubiertos[i], cubiertos[(i + 1) % cant], (i == cant - 1));
            filosofos[i].start();
        }

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
