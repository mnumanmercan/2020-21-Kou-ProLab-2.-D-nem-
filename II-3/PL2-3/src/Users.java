
public class Users {
    private int id;
    private String kullanici_adi;
    private String email;
    private String sifre;
    private int abonelik_id;

    public Users(int id, String kullanici_adi, String email, String sifre, int abonelik_id) {
        this.id = id;
        this.kullanici_adi = kullanici_adi;
        this.email = email;
        this.sifre = sifre;
        this.abonelik_id = abonelik_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public int getAbonelik_id() {
        return abonelik_id;
    }

    public void setAbonelik_id(int abonelik_id) {
        this.abonelik_id = abonelik_id;
    }
    
}
