package de.hsos.prog3.team5.ab02.ui;

import de.hsos.prog3.team5.ab02.util.EinUndAusgabe;

public class NutzerEingabeTest {
    public static void main(String[] args) {
        // write your code here
        EinUndAusgabe io = new EinUndAusgabe();
        NutzerEingabe test = new NutzerEingabe(io);

        System.out.println(test.anzahlZellenDesSpielfelds());
        System.out.println(test.anzahlDerSimulationsschritte());
        System.out.println(test.wahrscheinlichkeitDerBesiedlung());
    }
}
