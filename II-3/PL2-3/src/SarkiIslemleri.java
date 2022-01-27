
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SarkiIslemleri {

    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public ArrayList<Sarkilar> sarkilariGetir() {
        ArrayList<Sarkilar> cikti = new ArrayList<Sarkilar>();

        try {

            statement = con.createStatement();
            String sorgu = "Select * From sarkilar";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String sarkiAdi = rs.getString("sarki_adi");
                int sanatci_id = rs.getInt("sanatci_id");
                int album_id = rs.getInt("album_id");
                String tur = rs.getString("sarki_tur");
                String sure = rs.getString("sarki_sure");
                String dinle = rs.getString("dinlenme_sayisi");
                String tarih = rs.getString("sarki_tarih");
                String bilgi = rs.getString("bilgi");

                cikti.add(new Sarkilar(id, sarkiAdi, sanatci_id, album_id,tur, sure, dinle, tarih, bilgi));

            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void sarkiGuncelle(int id, String sarki_adi,int sanatci_id,int album_id, String sarki_tur, String sarki_sure, String dinlenme_sayisi,String sarki_tarih,String bilgi) {
        String sorgu = "Update sarkilar set sarki_adi = ? , sanatci_id = ? , album_id = ? ,sarki_tur = ? ,sarki_sure = ? ,dinlenme_sayisi = ? , sarki_tarih = ? , bilgi = ? where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, sarki_adi);
            preparedStatement.setInt(2, sanatci_id);
            preparedStatement.setInt(3, album_id);
            preparedStatement.setString(4, sarki_tur);
            preparedStatement.setString(5, sarki_sure);
            preparedStatement.setString(6, dinlenme_sayisi);
            preparedStatement.setString(7, sarki_tarih);
            preparedStatement.setString(8, bilgi);

            preparedStatement.setInt(9, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void sarkiSil(int id) {
        String sorgu = "Delete from sarkilar where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void sarkiEkle(String sarki_adi,int sanatci_id,int album_id, String sarki_tur, String sarki_sure, String dinlenme_sayisi,String sarki_tarih,String bilgi ) {
        String sorgu = "Insert Into sarkilar (sarki_adi,sanatci_id,album_id,sarki_tur,sarki_sure,dinlenme_sayisi,sarki_tarih,bilgi) VALUES (?,?,?,?,?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, sarki_adi);
            preparedStatement.setInt(2, sanatci_id);
            preparedStatement.setInt(3, album_id);
            preparedStatement.setString(4, sarki_tur);
            preparedStatement.setString(5, sarki_sure);
            preparedStatement.setString(6, dinlenme_sayisi);
            preparedStatement.setString(7, sarki_tarih);
            preparedStatement.setString(8, bilgi);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean girisYap(String admin_adi, String parola) {
        String sorgu = "Select * From adminler where username = ? and password = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, admin_adi);
            preparedStatement.setString(2, parola);

            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public SarkiIslemleri() {

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
