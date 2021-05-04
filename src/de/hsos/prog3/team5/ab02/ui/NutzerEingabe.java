package de.hsos.prog3.team5.ab02.ui;
import de.hsos.prog3.team5.ab02.util.*;



public class NutzerEingabe {

    private EinUndAusgabe io;
    private static int MINZEILEN = 2;
    private static int MAXZEILEN = 100;

    private static int MINSCHRITTE = 1;
    //private static int MAXSCHRITTE = 50;

    public NutzerEingabe(EinUndAusgabe io) {
        if (io != null) {
            this.io = io;
        }
    }

    public int anzahlZellenDesSpielfelds() {
        int anzahl;

        while (true) {
            System.out.print("Anzahl der Zellen (mind. 2): ");

            anzahl=  io.leseInteger();
            if(anzahl < MINZEILEN || anzahl > MAXZEILEN)

                System.out.println("Bitte nochmal!");
            else
                break;
        }
        return anzahl;
    }

    public int wahrscheinlichkeitDerBesiedlung(){
        int wert;
        while (true){
            System.out.print("Wahrscheinlichkeit der Besiedlung (1-100): ");
            wert = io.leseInteger();
            if(wert < 1 || wert > 100)
                System.out.println("Bitte nochmal!");
            else
                break;
        }
        return wert;
    }

    public int anzahlDerSimulationsschritte(){
        int anzahl;
        while (true){
            System.out.print("Anzahl der Simulationsschritte (min. 1 & max. 50; Abbruch mit negativer Zahl): ");
            anzahl = io.leseInteger();
            if(anzahl == 0)
                System.out.println("Bitte nochmal!");
            else if (anzahl < 0)
                return -1;
            else
                break;
        }
        return anzahl;
    }
}
