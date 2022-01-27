package Karakter;

import javax.swing.*;
import java.awt.image.BufferedImage;

public abstract class Karakter {
    private String ID;
    private String ad;
    private String tur;




    public Karakter(String ID, String ad, String tur) {
        this.ID = ID;
        this.ad = ad;
        this.tur = tur;

    }
    public void enKisaYol(){

    }
    public void karakterImg(){

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
}
