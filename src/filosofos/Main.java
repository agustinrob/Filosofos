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
            }
            catch (InterruptedException e) {
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
        public Semaphore comedor;

        Filosofo(int num, Cubierto izq, Cubierto der, Semaphore comedor) {
            number = num;
            this.izq = izq;
            this.der = der;
            this.comedor = comedor;
        }

        @Override
        public void run(){
            
            while (true) {
                System.out.println("Comedor tiene: " + comedor.availablePermits() + " permits.");
                try{
                    this.comedor.acquire(1);
                }
                catch(InterruptedException e){
                    e.printStackTrace(System.out);
                }
                izq.agarrar();
                System.out.println("Filosofo " + (number+1) + " toma cubierto izq.");
                der.agarrar();
                System.out.println("Filosofo " + (number+1) + " toma cubierto der.");
                comer();
                izq.soltar();
                System.out.println("Filosofo " + (number+1) + " suelta cubierto izq.");
                der.soltar();
                System.out.println("Filosofo " + (number+1) + " suelta cubierto der.");
                this.comedor.release(1); //como y me voy del comedor
            }
        }

        void comer() {
            try {
                int sleepTime = ThreadLocalRandom.current().nextInt(0, 1000);
                System.out.println("Filosofo " + (number+1) + " come por " + sleepTime);
                Thread.sleep(sleepTime);
            }
            catch (InterruptedException e) {
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

        for (int i = 0; (i < cant) && (comedor.availablePermits() > 0); i++) {        
            filosofos[i] = new Filosofo(i, cubiertos[i], cubiertos[(i + 1) % cant], comedor);
            filosofos[i].start();
        }

        while (true) {
            try {
                // sleep 1 sec
                Thread.sleep(1000);

                // check for deadlock
                boolean deadlock = true;
                for (Cubierto f : cubiertos) {
                    if (f.estaLibre()) {
                        deadlock = false;
                        break;
                    }
                }
                if (deadlock) {
                    Thread.sleep(1000);
                    System.out.println("Todos comen");
                    break;
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
        }

        System.out.println("Salir");
        System.exit(0);
    }

}
