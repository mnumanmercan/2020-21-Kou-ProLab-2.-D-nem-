
public class GirisEkrani extends javax.swing.JFrame {
    SarkiIslemleri sarkiIslemleri = new SarkiIslemleri();
    SanatciIslemleri sanatciIslemleri = new SanatciIslemleri();
    AlbumIslemleri albumIslemleri = new AlbumIslemleri();
    KullaniciIslemleri kullaniciIslemleri = new KullaniciIslemleri();
    /**
     * Creates new form GirisEkrani
     */
    public GirisEkrani() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admin_adi_alani = new javax.swing.JTextField();
        parola_alani = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admin_mesaj_yazisi = new javax.swing.JLabel();
        admin_giris = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kullanici_adi_alani = new javax.swing.JTextField();
        kullanici_giris = new javax.swing.JButton();
        kullanici_mesaj_yazisi = new javax.swing.JLabel();
        kullanici_sifre_alani = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("tab_attention_fill_lower"));
        setBounds(new java.awt.Rectangle(500, 220, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(709, 500));
        getContentPane().setLayout(null);

        admin_adi_alani.setBackground(new java.awt.Color(255, 204, 255));
        admin_adi_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_adi_alaniActionPerformed(evt);
            }
        });
        getContentPane().add(admin_adi_alani);
        admin_adi_alani.setBounds(124, 189, 163, 22);

        parola_alani.setBackground(new java.awt.Color(255, 204, 255));
        parola_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parola_alaniActionPerformed(evt);
            }
        });
        getContentPane().add(parola_alani);
        parola_alani.setBounds(124, 224, 163, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/headphonesGiris2Boyut.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 0, 150, 150);

        jLabel2.setText("Password :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(55, 227, 64, 16);

        admin_mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 0));
        admin_mesaj_yazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_mesaj_yazisi.setText("----------------------");
        admin_mesaj_yazisi.setAutoscrolls(true);
        getContentPane().add(admin_mesaj_yazisi);
        admin_mesaj_yazisi.setBounds(12, 314, 336, 27);

        admin_giris.setBackground(new java.awt.Color(204, 204, 255));
        admin_giris.setText("Giris Yap");
        admin_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_girisActionPerformed(evt);
            }
        });
        getContentPane().add(admin_giris);
        admin_giris.setBounds(130, 370, 97, 36);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(350, 140, 6, 288);

        jLabel3.setText("Username :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(408, 192, 67, 16);

        jLabel4.setText("Password :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(408, 232, 64, 16);

        kullanici_adi_alani.setBackground(new java.awt.Color(255, 204, 255));
        getContentPane().add(kullanici_adi_alani);
        kullanici_adi_alani.setBounds(487, 189, 144, 22);

        kullanici_giris.setBackground(new java.awt.Color(204, 204, 255));
        kullanici_giris.setText("Giris Yap");
        kullanici_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_girisActionPerformed(evt);
            }
        });
        getContentPane().add(kullanici_giris);
        kullanici_giris.setBounds(489, 365, 97, 36);

        kullanici_mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 0));
        kullanici_mesaj_yazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullanici_mesaj_yazisi.setText("----------------------");
        kullanici_mesaj_yazisi.setAutoscrolls(true);
        getContentPane().add(kullanici_mesaj_yazisi);
        kullanici_mesaj_yazisi.setBounds(371, 311, 326, 27);

        kullanici_sifre_alani.setBackground(new java.awt.Color(255, 204, 255));
        getContentPane().add(kullanici_sifre_alani);
        kullanici_sifre_alani.setBounds(487, 229, 144, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user30.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(540, 120, 90, 60);

        jLabel6.setText("Admin :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(55, 192, 45, 16);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login40.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(590, 360, 130, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userLogin50.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 130, 130, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login40.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(230, 360, 130, 60);

        jLabel10.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 51));
        jLabel10.setText("DOSYAM");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(440, 50, 110, 60);

        jLabel11.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 51));
        jLabel11.setText("MÜZİK");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(170, 50, 110, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admin_adi_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_adi_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_adi_alaniActionPerformed

    private void parola_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parola_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parola_alaniActionPerformed

    private void admin_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_girisActionPerformed
       admin_mesaj_yazisi.setText("");
       
       String admin_adi = admin_adi_alani.getText();
       String parola = new String(parola_alani.getPassword());
       
       boolean girisbasarili = sarkiIslemleri.girisYap(admin_adi,parola);
       
       if(girisbasarili){
          // SarkiTablosu sarkiTablosu = new SarkiTablosu(this, true);
           SarkiTablosuFrame sarkiTablosuFrame = new SarkiTablosuFrame();
           setVisible(false);
           //sarkiTablosu.setVisible(true);
           sarkiTablosuFrame.setVisible(true);
           //mesaj_yazisi.setText("GIRIS BASARILI...");
           //System.exit(0);
       }else{
           admin_mesaj_yazisi.setText("Giris basarisiz! Lutfen tekrar deneyin...");
       }
    }//GEN-LAST:event_admin_girisActionPerformed

    private void kullanici_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_girisActionPerformed
        admin_mesaj_yazisi.setText("");
        
        String kullanici_adi = kullanici_adi_alani.getText();
        String sifre = new String(kullanici_sifre_alani.getPassword());
        
        boolean girisBasarili = kullaniciIslemleri.girisYap(kullanici_adi, sifre);
        if(girisBasarili){
            KullaniciFrame calmaListesi = new KullaniciFrame();
            setVisible(false);
            calmaListesi.setVisible(true);
            //System.exit(0);
        }else{
            kullanici_mesaj_yazisi.setText("Giris basarisiz! Lutfen tekrar deneyin");
        }
    }//GEN-LAST:event_kullanici_girisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admin_adi_alani;
    private javax.swing.JButton admin_giris;
    private javax.swing.JLabel admin_mesaj_yazisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField kullanici_adi_alani;
    private javax.swing.JButton kullanici_giris;
    private javax.swing.JLabel kullanici_mesaj_yazisi;
    private javax.swing.JPasswordField kullanici_sifre_alani;
    private javax.swing.JPasswordField parola_alani;
    // End of variables declaration//GEN-END:variables
}
