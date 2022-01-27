package Karakter;

import javax.swing.*;

public class Dusman extends Karakter {
    private String dusmanID;
    private String dusmanAdi;
    private String dusmanTur;
    public Dusman(String ID, String ad, String tur) {
        super(ID, ad, tur);
    }

    public String getDusmanID() {
        return dusmanID;
    }

    public void setDusmanID(String dusmanID) {
        this.dusmanID = dusmanID;
    }

    public String getDusmanAdi() {
        return dusmanAdi;
    }

    public void setDusmanAdi(String dusmanAdi) {
        this.dusmanAdi = dusmanAdi;
    }

    public String getDusmanTur() {
        return dusmanTur;
    }

    public void setDusmanTur(String dusmanTur) {
        this.dusmanTur = dusmanTur;
    }
}
