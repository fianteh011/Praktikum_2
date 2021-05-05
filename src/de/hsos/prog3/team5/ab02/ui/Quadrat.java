package de.hsos.prog3.team5.ab02.ui;

import de.hsos.prog3.team5.ab02.util.Interaktionsbrett;

public class Quadrat {
    private int x = 0;
    private int y = 0;
    private int seitenlaenge = 0;

    //Größe des Interaktionsbrettes; nicht veränderbar
    //Alternative: Default Werte im Konstruktor
    private static final int dimX = 380;
    private static final int dimY = 380;

    public Quadrat(int x, int y, int seitenlaenge) {
        //pruefe, ob Quadrat innerhalb des Interaktionsbrettes liegt (Größe 380x500px)
        //und setze Objektvariablen, falls ok
        this.setSeitenlaenge(seitenlaenge);
        this.setX(x);
        this.setY(y);
    }

    //setter & getter
    //(Stil-)Frage: getter und setter sinnvoll(da private), oder lieber direkten Zugriff auf die Variablen?
    private void setX(int x){
        if (0 <= x && x < dimX - this.seitenlaenge){
            this.x = x;
        }else{
            System.out.println("Dimension ueberschritten: " + x);
        }
    }

    private void setY(int y){
        if (0 <= y && y < dimY - this.seitenlaenge){
            this.y = y;
        }else{
            System.out.println("Dimension ueberschritten: " + y);
        }
    }

    private void setSeitenlaenge(int seitenlaenge) {
        if (seitenlaenge < 380){
            this.seitenlaenge = seitenlaenge;
        }else{
            System.out.println("Seitenlaenge = 0; Nochmal überprüfen!");
        }
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
