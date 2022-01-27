
public class Albumler {
    
    private int id;
    private String album_adi;
    private int sanatci_id;
    private int sarki_id;
    private String album_tur;
    private String album_tarih;

    public Albumler(int id, String album_adi, int sanatci_id, int sarki_id, String album_tur, String album_tarih) {
        this.id = id;
        this.album_adi = album_adi;
        this.sanatci_id = sanatci_id;
        this.sarki_id = sarki_id;
        this.album_tur = album_tur;
        this.album_tarih = album_tarih;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlbum_adi() {
        return album_adi;
    }

    public void setAlbum_adi(String album_adi) {
        this.album_adi = album_adi;
    }

    public int getSanatci_id() {
        return sanatci_id;
    }

    public void setSanatci_id(int sanatci_id) {
        this.sanatci_id = sanatci_id;
    }

    public int getSarki_id() {
        return sarki_id;
    }

    public void setSarki_id(int sarki_id) {
        this.sarki_id = sarki_id;
    }

    public String getAlbum_tur() {
        return album_tur;
    }

    public void setAlbum_tur(String album_tur) {
        this.album_tur = album_tur;
    }

    public String getAlbum_tarih() {
        return album_tarih;
    }

    public void setAlbum_tarih(String album_tarih) {
        this.album_tarih = album_tarih;
    }
    
}
