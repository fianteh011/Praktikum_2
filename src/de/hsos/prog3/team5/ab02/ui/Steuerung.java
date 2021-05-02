package de.hsos.prog3.team5.ab02.ui;
import de.hsos.prog3.team5.ab02.logik.BeiAenderung;
import de.hsos.prog3.team5.ab02.logik.Simulation;
import de.hsos.prog3.team5.ab02.logik.Simulator;


public class Steuerung implements BeiAenderung {
    private SpielfeldDarstellung spielfeldDarstellung;
//    private NutzerEingabe nztInput;

    public void StartDesSpiels() {

    }

    private void initialisierung() {


    }

    public void aktualisere(boolean[][] neueGeneration) {

    }


    @Override
    public void aktualisiere(boolean[][] neueGeneration) {
        //anmeldenFuerAktualisierungBeiAenderung
        Simulation s = new Simulator();
        s.anmeldenFuerAktualisierungBeiAenderung(this);

    }
}
