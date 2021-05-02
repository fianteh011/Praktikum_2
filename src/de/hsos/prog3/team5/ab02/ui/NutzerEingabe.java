package de.hsos.prog3.team5.ab02.ui;
import de.hsos.prog3.team5.ab02.util.*;

public class NutzerEingabe {
    private EinUndAusgabe io;

    public NutzerEingabe(EinUndAusgabe io){
        if(io != null){
            this.io = io;
        }
    }

    public int anzahlZellenDesSpielfelds(){
        int anzahl;
        while (true){
            System.out.print("Anzahl der Zellen (mind. 2): ");
            anzahl=  io.leseInteger();
            if(anzahl < 2)
                System.out.println("Biite nochmal!");
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
                System.out.println("Biite nochmal!");
            else
                break;
        }
        return wert;
    }

    public int anzahlDerSimulationsschritte(){
        int anzahl;
        while (true){
            System.out.print("Anzahl der imulationsschritte (mind. 2 & max. 50): ");
            anzahl = io.leseInteger();
            if(anzahl < 2 || anzahl > 50)
                System.out.println("Biite nochmal!");
            else
                break;
        }
        return anzahl;
    }
}
