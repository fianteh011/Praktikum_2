package de.hsos.prog3.team5.ab02.ui;

import de.hsos.prog3.team5.ab02.util.Interaktionsbrett;

public class Quadrat {
    private int x;
    private int y;
    private int seitenlaenge;

    public Quadrat(int x, int y, int seitenlaenge) {
        this.x = x;
        this.y = y;
        this.seitenlaenge = seitenlaenge;
    }

    public void darstellenRahmen(Interaktionsbrett ib){

    }

    public void darstellenFuellung(Interaktionsbrett ib){

    }

    @Override
    public String toString() {
        return "Quadrat{" + "x=" + x + ", y=" + y + ", seitenlaenge=" + seitenlaenge + '}';
    }
}