package hu.iac.opdracht1.controller;

import hu.iac.opdracht1.model.Stad;
import hu.iac.opdracht1.model.WSInterface;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class PowerServiceImpl implements WSInterface {
    private Stad stad = new Stad();

    @WebMethod()
    public int geefAantalKoffieautomaten(String stad) {
        Stad.Steden s = Stad.Steden.valueOf(stad.toUpperCase());
        return this.stad.geefAantalKoffieAutomaten(s);
    }

    @WebMethod()
    public int geefTotaal() {
        int count = 0;
        for (Stad.Steden stad : Stad.Steden.values()) {
            count += geefAantalKoffieautomaten(String.valueOf(stad));
        }
        return count;
    }
}