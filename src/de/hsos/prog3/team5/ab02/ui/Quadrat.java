package de.hsos.prog3.team5.ab02.ui;

import de.hsos.prog3.team5.ab02.util.Interaktionsbrett;

public class Quadrat {
    private int x;
    private int y;
    private int seitenlaenge;

    //Größe des Interaktionsbrettes; nicht veränderbar
    private static final int dimX = 380;
    private static final int dimY = 500;

    public Quadrat(int x, int y, int seitenlaenge) {
        //pruefe, ob Quadrat innerhalb des Interaktionsbrettes liegt (Größe 380x500px)
        //und setze Objektvariablen, falls ok
        // TODO: was, wenn es nicht passt? Ausnahme?
        if (0 < x && x < dimX && 0 < y && y < dimY){
            if (seitenlaenge < (dimY-y) && seitenlaenge < (dimX-x)){
                this.setX(x);
                this.setY(y);
                this.setSeitenlaenge(seitenlaenge);
            }
        }
    }

    //setter & getter
    //(Stil-)Frage: getter und setter sinnvoll(da private), oder lieber direkten Zugriff auf die Variablen?
    private void setX(int x){
        this.x = x;
    }

    private void setY(int y){
        this.y = y;
    }

    private void setSeitenlaenge(int seitenlaenge) {
        this.seitenlaenge = seitenlaenge;
    }

    private int getX() {
        return x;
    }

    private int getY() {
        return y;
    }

    private int getSeitenlaenge() {
        return seitenlaenge;
    }

    //Methoden zum Zeichnen
    public void darstellenRahmen(Interaktionsbrett ib){
        ib.neuesRechteck(this.getX(), this.getY(), this.getSeitenlaenge(), this.getSeitenlaenge());
    }

    public void darstellenFuellung(Interaktionsbrett ib){
        for (int i = 0; i < this.getSeitenlaenge(); i++){
            ib.neueLinie(this.getX()+i, this.getY(), this.getX()+i, this.getY()+this.getSeitenlaenge());
        }
    }


    @Override
    public String toString() {
        return "Quadrat{" + "x=" + x + ", y=" + y + ", seitenlaenge=" + seitenlaenge + '}';
    }
}
