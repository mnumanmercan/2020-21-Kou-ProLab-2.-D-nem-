
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SanatciIslemleri {

    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public ArrayList<Sanatcilar> sanatcilariGetir() {
        ArrayList<Sanatcilar> cikti = new ArrayList<Sanatcilar>();

        try {

            statement = con.createStatement();
            String sorgu = "Select * From sanatci";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String sanatciAdi = rs.getString("sanatci_adi");
                String ulke = rs.getString("ulke");

                cikti.add(new Sanatcilar(id, sanatciAdi, ulke));

            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void sanatciGuncelle(int id, String yeni_ad, String yeni_ulke) {
        String sorgu = "Update sanatci set sanatci_adi = ?, ulke = ? where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_ulke);
            preparedStatement.setInt(3, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SanatciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void sanatciSil(int id) {
        String sorgu = "Delete from sanatci where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sanatciEkle(String sanatci_adi, String ulke) {

        String sorgu = "Insert Into sanatci (sanatci_adi,ulke) VALUES (?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, sanatci_adi);
            preparedStatement.setString(2, ulke);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SanatciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   /* public boolean girisYap(String kullanici_adi, String parola) {
        String sorgu = "Select * From kullanici where ad = ? and sifre = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);

            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }*/

    public SanatciIslemleri() {

        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi;

        try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }

        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı...");

        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }

    }
}
