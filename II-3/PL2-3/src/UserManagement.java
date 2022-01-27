
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserManagement {
    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    public ArrayList<Users> kullanicilariGetir() {
        ArrayList<Users> cikti = new ArrayList<Users>();

        try {

            statement = con.createStatement();
            String sorgu = "Select * From kullanici";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String kullaniciAdi = rs.getString("ad");
                String email = rs.getString("email");
                String sifre = rs.getString("sifre");
                int abonelikId = rs.getInt("abonelik_id");
               

                cikti.add(new Users(id, kullaniciAdi, email, sifre, abonelikId));

            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    public UserManagement() {

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
