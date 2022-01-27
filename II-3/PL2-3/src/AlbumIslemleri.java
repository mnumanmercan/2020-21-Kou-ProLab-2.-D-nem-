


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlbumIslemleri {

    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public ArrayList<Albumler> albumleriGetir() {
        ArrayList<Albumler> cikti = new ArrayList<Albumler>();

        try {

            statement = con.createStatement();
            String sorgu = "Select * From album";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String albumAdi = rs.getString("album_adi");
                int sanatciId = rs.getInt("sanatci_id");
                int sarkiId = rs.getInt("sarki_id");
                String albumTur = rs.getString("album_tur");
                String albumTarih = rs.getString("album_tarih");

                cikti.add(new Albumler(id, albumAdi, sanatciId, sarkiId, albumTur, albumTarih));

            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void albumGuncelle(int id, String album_adi, int sanatciId, int sarkiId, String albumTur, String albumTarih) {
        String sorgu = "Update album set album_adi = ?, sanatci_id = ?,sarki_id = ?, album_tur = ?, album_tarih = ? where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, album_adi);
            preparedStatement.setInt(2, sanatciId);
            preparedStatement.setInt(3, sarkiId);
            preparedStatement.setString(4, albumTur);
            preparedStatement.setString(5, albumTarih);
            preparedStatement.setInt(6, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SanatciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void albumSil(int id) {
        String sorgu = "Delete from album where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void albumEkle(String album_adi, int sanatci_id, int sarki_id, String album_tur, String album_tarih) {

        String sorgu = "Insert Into album (album_adi,sanatci_id,sarki_id,album_tur,album_tarih) VALUES (?,?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, album_adi);
            preparedStatement.setInt(2, sanatci_id);
            preparedStatement.setInt(3, sarki_id);
            preparedStatement.setString(4, album_tur);
            preparedStatement.setString(5, album_tarih);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SanatciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public AlbumIslemleri() {

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
