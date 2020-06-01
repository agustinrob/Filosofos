package filosofos;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static int cant = 5;
    static Filosofo filosofos[] = new Filosofo[cant];
    static Cubierto cubiertos[] = new Cubierto[cant];

    static class Cubierto {

        public Semaphore mutex = new Semaphore(1);

        void agarrar() {
            try {
                mutex.acquire(1);
            } catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
        }

        void soltar() {
            mutex.release(1);
        }

        boolean estaLibre() {
            return mutex.availablePermits() > 0;
        }

    }

    static class Filosofo extends Thread {

        public int number;
        public Cubierto izq;
        public Cubierto der;
        public boolean esUltimo;

        Filosofo(int num, Cubierto izq, Cubierto der, boolean esUltimo) {
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
                    System.out.println("Filosofo " + (number + 1) + " toma cubierto der.");
                    izq.agarrar();
                    System.out.println("Filosofo " + (number + 1) + " toma cubierto izq.");
                    comer();
                    izq.soltar();
                    System.out.println("Filosofo " + (number + 1) + " suelta cubierto izq.");
                    der.soltar();
                    System.out.println("Filosofo " + (number + 1) + " suelta cubierto der.");
                } else {
                    izq.agarrar();
                    System.out.println("Filosofo " + (number + 1) + " toma cubierto izq.");
                    der.agarrar();
                    System.out.println("Filosofo " + (number + 1) + " toma cubierto der.");
                    comer();
                    izq.soltar();
                    System.out.println("Filosofo " + (number + 1) + " suelta cubierto izq.");
                    der.soltar();
                    System.out.println("Filosofo " + (number + 1) + " suelta cubierto der.");
                }
            }
        }

        void comer() {
            try {
                int sleepTime = ThreadLocalRandom.current().nextInt(0, 1000);
                System.out.println("Filosofo " + (number + 1) + " come por " + sleepTime);
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
        }

    }

    public static void main(String argv[]) {

        Semaphore comedor = new Semaphore(4);

        System.out.println("comedor: " + comedor);

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
