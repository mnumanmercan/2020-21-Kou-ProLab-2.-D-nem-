package Karakter;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class Oyuncu extends Karakter{

    private int skor;

    public Oyuncu(String ID, String ad, String tur, int skor) {
        super(ID, ad, tur);
        this.skor = skor;

    }
    public void PuaniGoster(){
        getSkor();
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

}
