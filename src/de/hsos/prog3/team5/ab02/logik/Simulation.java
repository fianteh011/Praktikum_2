package de.hsos.prog3.team5.ab02.logik;

public interface Simulation {
    void berechneAnfangsGeneration(int anzahlDerZeilen, int wahrscheinlichkeitDerBesiedlung);
    void berechneFolgeGeneration(int berechnungschnitte);
    void anmeldenFuerAktualisierungBeiAenderung(BeiAenderung beiAenderung);
}
