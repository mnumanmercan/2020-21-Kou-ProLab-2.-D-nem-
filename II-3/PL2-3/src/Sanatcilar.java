
public class Sanatcilar {
    private int id;
    private String sanatci_adi;
    private String ulke;

    public Sanatcilar(int id, String sanatci_adi, String ulke) {
        this.id = id;
        this.sanatci_adi = sanatci_adi;
        this.ulke = ulke;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSanatci_adi() {
        return sanatci_adi;
    }

    public void setSanatci_adi(String sanatci_adi) {
        this.sanatci_adi = sanatci_adi;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }
    
}
