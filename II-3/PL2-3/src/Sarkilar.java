
public class Sarkilar {
    private int id;
    private String sarki_adi;
    private int sanatci_id;
    private int album_id;
    private String sarki_tur;
    private String sarki_sure;
    private String dinlenme;
    private String sarki_tarih;
    private String bilgi;

    public Sarkilar(int id, String sarki_adi, int sanatci_id, int album_id, String saki_tur, String sarki_sure, String dinlenme, String sarki_tarih, String bilgi) {
        this.id = id;
        this.sarki_adi = sarki_adi;
        this.sanatci_id = sanatci_id;
        this.album_id = album_id;
        this.sarki_tur = saki_tur;
        this.sarki_sure = sarki_sure;
        this.dinlenme = dinlenme;
        this.sarki_tarih = sarki_tarih;
        this.bilgi = bilgi;
    }

    public int getSanatci_id() {
        return sanatci_id;
    }

    public void setSanatci_id(int sanatci_id) {
        this.sanatci_id = sanatci_id;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSarki_adi() {
        return sarki_adi;
    }

    public void setSarki_adi(String sarki_adi) {
        this.sarki_adi = sarki_adi;
    }

    public String getSaki_tur() {
        return sarki_tur;
    }

    public void setSaki_tur(String saki_tur) {
        this.sarki_tur = saki_tur;
    }

    public String getSarki_sure() {
        return sarki_sure;
    }

    public void setSarki_sure(String sarki_sure) {
        this.sarki_sure = sarki_sure;
    }

    public String getDinlenme() {
        return dinlenme;
    }

    public void setDinlenme(String dinlenme) {
        this.dinlenme = dinlenme;
    }

    public String getSarki_tarih() {
        return sarki_tarih;
    }

    public void setSarki_tarih(String sarki_tarih) {
        this.sarki_tarih = sarki_tarih;
    }

    public String getBilgi() {
        return bilgi;
    }

    public void setBilgi(String bilgi) {
        this.bilgi = bilgi;
    }

    
    
}
