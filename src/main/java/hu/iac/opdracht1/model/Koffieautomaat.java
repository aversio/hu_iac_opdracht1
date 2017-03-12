package hu.iac.opdracht1.model;

/**
 * Created by lap on 10-3-2017.
 */
public class Koffieautomaat {
    private String merk;
    private String model;

    public Koffieautomaat(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
