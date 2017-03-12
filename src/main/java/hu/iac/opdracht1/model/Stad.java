package hu.iac.opdracht1.model;

import java.util.List;

/**
 * Created by lap on 10-3-2017.
 */
public class Stad {
    private String naam;
    private List<Koffieautomaat> koffieautomaten;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public List<Koffieautomaat> getKoffieautomaten() {
        return koffieautomaten;
    }

    public void voegAutomaatToe(Koffieautomaat koffieautomaat) {
        this.koffieautomaten.add(koffieautomaat);
    }

    public enum Steden {UTRECHT, AMERSFOORT, ARNHEM, DEN_HAAG}

    public int geefAantalKoffieAutomaten(Steden stad) {
        int count = 0;
        switch (stad) {
            case AMERSFOORT: count = 450; break;
            case UTRECHT: count = 350; break;
            case ARNHEM: count = 400; break;
            case DEN_HAAG: count = 500;
        }
        return count;
    }
}
