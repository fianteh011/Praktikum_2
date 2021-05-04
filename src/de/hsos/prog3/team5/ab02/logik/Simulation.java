package de.hsos.prog3.team5.ab02.logik;

public interface Simulation {
    void berechneAnfangsGeneration(int anzahlDerZeilen, int wahrscheinlichkeitDerBesiedlung);


    boolean berechneFolgeGeneration(int berechnungschnitte) throws InterruptedException;

    void anmeldenFuerAktualisierungBeiAenderung(BeiAenderung beiAenderung);

}
