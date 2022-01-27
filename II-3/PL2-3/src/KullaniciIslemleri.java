
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KullaniciIslemleri {
    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
     public boolean girisYap(String admin_adi, String parola) {
        String sorgu = "Select * From kullanici where ad = ? and sifre = ?";

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
     
     public KullaniciIslemleri() {

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
