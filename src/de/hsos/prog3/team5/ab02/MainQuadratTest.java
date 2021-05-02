package de.hsos.prog3.team5.ab02;

import de.hsos.prog3.team5.ab02.ui.Quadrat;
import de.hsos.prog3.team5.ab02.util.Interaktionsbrett;

public class MainQuadratTest {

    public static void main(String[] args) {
        Interaktionsbrett ib = new Interaktionsbrett();

        Quadrat qua1 = new Quadrat(10, 10, 20);
        qua1.darstellenRahmen(ib);

        Quadrat qua2 = new Quadrat(40, 10, 20);
        qua2.darstellenFuellung(ib);
    }

}
