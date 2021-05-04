package de.hsos.prog3.team5.ab02.logik;

import java.util.Random;

public class Simulator implements Simulation {

    private BeiAenderung beiAenderung;
    
    private boolean[][] spielfeld;

    private Random rnd;

    public static boolean BEWOHNT = true;
    public static boolean UNBEWOHNT = false;
    int zufallsZahl;
    //vllt kein Konstruktor?
    public Simulator() {
        rnd = new Random();
    }


    @Override
    public void berechneAnfangsGeneration(int anzahlDerZeilen, int wahrscheinlichkeitDerBesiedlung) {
        this.spielfeld = new boolean[anzahlDerZeilen][anzahlDerZeilen];
        if (beiAenderung != null) {
            for (int x = 0; x < spielfeld.length; x++) {
                for (int y = 0; y < spielfeld.length; y++) {
                   zufallsZahl = rnd.nextInt();
                    if (zufallsZahl <= wahrscheinlichkeitDerBesiedlung){
                        this.spielfeld[x][y] = BEWOHNT;
                    } else {
                        this.spielfeld[x][y] = UNBEWOHNT;
                    }
                }
            }
            beiAenderung.aktualisiere(spielfeld);
        }
    }

    @Override

    public void berechneFolgeGeneration(int berechnungschritte) throws InterruptedException {

        for (int b = 0; b < berechnungschritte; b++){
            Thread.sleep(1000);
            for (int x = 0; x < spielfeld.length; x++) {
                for (int y = 0; y < spielfeld.length; y++) {
                    //System.out.println(spielfeld[x][y]);

                    int neighbors = nachbar(x,y);
                    System.out.println(neighbors);
                    if(!(spielfeld[x][y] == BEWOHNT && (neighbors == 2 || neighbors == 3))){
                        spielfeld[x][y] = UNBEWOHNT;
                    }else if (spielfeld[x][y] == UNBEWOHNT && neighbors == 3){
                        spielfeld[x][y] = BEWOHNT;
                    }
                }
            }
            beiAenderung.aktualisiere(spielfeld);
        }
    }

    private int nachbar(int x, int y){
        //https://www.geeksforgeeks.org/program-for-conways-game-of-life/
        int nachbar = 0;
        if (spielfeld[x][y] == BEWOHNT){
            nachbar--;
        }
        for (int i = -1; i <= 1; i++){
            for (int j = -1; j <= 1; j++){
                if (x+i < 0 || y+j < 0 || x+i >= spielfeld.length || y+j >= spielfeld.length){
                    continue;
                }
                if (spielfeld[x + i][y + j] == BEWOHNT){
                    nachbar++;
                }

            }
        }
        return nachbar;
    }
/*
    private int nachbar(int x, int y){
        int count = 0;

        int[] xo = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] yo = {0, 1, 1, 1, 0, -1, -1, -1};

        for (int i = 0; i < 8; i++){
            if ((x+xo[i] < anzahlFelder) && (x+xo[i] > -1))
                if ((y+yo[i] < anzahlFelder) && (y+yo[i] > -1))
                    if (spielfeld[x + xo[i]][y + yo[i]])
                        count++;
        }

        return count;
    }
*/
    @Override
    public void anmeldenFuerAktualisierungBeiAenderung(BeiAenderung beiAenderung) {
        if(beiAenderung != null)
            this.beiAenderung = beiAenderung;
    }
}
