package de.hsos.prog3.team5.ab02.logik;

public class Simulator implements Simulation {

    private BeiAenderung beiAenderung;
    private boolean[][] spielfeld;
    public static boolean bewohnt;

    public Simulator() {

    }

    @Override
    public void berechneAnfangsGeneration(int anzahlDerZeilen, int wahrscheinlichkeitDerBesiedlung) {
        if (spielfeld != null) beiAenderung.aktualisiere(spielfeld);

    }

    @Override
    public void berechneFolgeGeneration(int berechnungschritte) {
        if (spielfeld != null) beiAenderung.aktualisiere(spielfeld);


    @Override
    public void anmeldenFuerAktualisierungBeiAenderung(BeiAenderung beiAenderung) {

    }
}
