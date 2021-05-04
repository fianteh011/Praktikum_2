package de.hsos.prog3.team5.ab02.ui;

import de.hsos.prog3.team5.ab02.logik.Simulator;
import de.hsos.prog3.team5.ab02.util.Interaktionsbrett;

public class SpielfeldDarstellung {
    Interaktionsbrett ib;

    private static final int SEITENLAENGE = 360;
    private static final int MARGIN = 20;


    public SpielfeldDarstellung(Interaktionsbrett ib) {
        this.ib = ib;
    }

    //Zur Skalierung der Rechtecke
    public void spielfeldDarstellen(boolean[][] spielfeld) {
        abwischen();
        //System.out.println(spielfeld.length);
        for (int y = 0; y < spielfeld.length; y++) {
            for (int x = 0; x < spielfeld.length; x++) {
                Quadrat sq = new Quadrat(
                        (SEITENLAENGE / spielfeld.length) * x,
                        (SEITENLAENGE / spielfeld.length) * y,
                        SEITENLAENGE / spielfeld.length);
                sq.darstellenRahmen(ib);
                //System.out.println(SEITENLAENGE / spielfeld.length);
                //System.out.println((SEITENLAENGE / spielfeld.length) * x + ", " + (SEITENLAENGE / spielfeld.length) * y);
                if (spielfeld[x][y] == Simulator.BEWOHNT) {
                    sq.darstellenFuellung(ib);
                }
            }
        }

    }

    public void abwischen() {
        this.ib.abwischen();
    }
}
