package de.hsos.prog3.team5.ab02.ui;
import de.hsos.prog3.team5.ab02.logik.BeiAenderung;
import de.hsos.prog3.team5.ab02.logik.Simulation;
import de.hsos.prog3.team5.ab02.logik.Simulator;
import de.hsos.prog3.team5.ab02.util.EinUndAusgabe;
import de.hsos.prog3.team5.ab02.util.Interaktionsbrett;


public class Steuerung implements BeiAenderung {
    private SpielfeldDarstellung spielfeldDarstellung;
    private NutzerEingabe nztInput;
    private Simulator sim;

    public Steuerung(){
        this.initialisierung();
        this.startDesSpiels();
    }

    public void startDesSpiels() {
        int anzahlZellen = this.nztInput.anzahlZellenDesSpielfelds();
        int wahrschDerBesiedl = this.nztInput.wahrscheinlichkeitDerBesiedlung();
        sim.berechneAnfangsGeneration(anzahlZellen, wahrschDerBesiedl);
        while(true){
            int schritte = this.nztInput.anzahlDerSimulationsschritte();
            if(schritte < 0){
                break;
            }
            try {
                if (!sim.berechneFolgeGeneration(schritte)){
                    System.out.println("Endzustand erreicht!");
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void initialisierung() {
        this.spielfeldDarstellung = new SpielfeldDarstellung(new Interaktionsbrett());
        this.nztInput = new NutzerEingabe(new EinUndAusgabe());
        this.sim = new Simulator();
        sim.anmeldenFuerAktualisierungBeiAenderung(this);
    }


    @Override
    public void aktualisiere(boolean[][] neueGeneration) {

        spielfeldDarstellung.spielfeldDarstellen(neueGeneration);
    }

}
