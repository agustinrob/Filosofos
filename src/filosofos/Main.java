package filosofos;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static int cant = 5;
    static Profesor filosofos[] = new Profesor[cant];
    static Lapiz cubiertos[] = new Lapiz[cant];
    static String nombres[] = new String[]{"Caffa", "Bentos", "Mateus", "Kereki", "Adorjan"};

    public static void main(String argv[]) {

        MainFram mf=new MainFram();
        mf.show();
        for (int i = 0; i < cant; i++) {
            cubiertos[i] = new Lapiz();
        }

        for (int i = 0; (i < cant); i++) {
            filosofos[i] = new Profesor(i, cubiertos[i], cubiertos[(i + 1) % cant], (i == cant - 1), nombres[i], mf);
            filosofos[i].start();
        }

        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
