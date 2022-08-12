/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import JavaClass.MahsulObject;
import Database.ConnectionDB;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Mahsul_jframe extends javax.swing.JFrame {

    ArrayList<MahsulObject> MahsulListesi;

    public Mahsul_jframe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        urunadi_tf = new javax.swing.JTextField();
        urunkodu_tf = new javax.swing.JTextField();
        protein_tf = new javax.swing.JTextField();
        hektolitre_tf = new javax.swing.JTextField();
        filizlenmistane_tf = new javax.swing.JTextField();
        ekle_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kaliteno_tf = new javax.swing.JTextField();
        kalitekodu_tf = new javax.swing.JTextField();
        fiyat_tf = new javax.swing.JTextField();
        listele_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listele_jlist = new javax.swing.JList<>();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mahsul Fiyatlandırma");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 255)));
        jPanel2.setForeground(new java.awt.Color(255, 204, 255));
        jPanel2.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ürün kodu:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ürün adı:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Protein Değeri:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Hektolitre Değeri:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Filizlenmiş/Çimlenmiş Tane:");

        urunadi_tf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        urunadi_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                urunadi_tfKeyPressed(evt);
            }
        });

        urunkodu_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                urunkodu_tfKeyPressed(evt);
            }
        });

        protein_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                protein_tfKeyPressed(evt);
            }
        });

        hektolitre_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hektolitre_tfKeyPressed(evt);
            }
        });

        filizlenmistane_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filizlenmistane_tfKeyPressed(evt);
            }
        });

        ekle_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ekle_btn.setText("Hesapla");
        ekle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urunadi_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(urunkodu_tf)
                    .addComponent(protein_tf)
                    .addComponent(hektolitre_tf)
                    .addComponent(filizlenmistane_tf))
                .addGap(283, 283, 283)
                .addComponent(ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(urunadi_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(urunkodu_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(protein_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hektolitre_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(filizlenmistane_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel4.setForeground(new java.awt.Color(204, 102, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Kalite Numarası:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Kalite Kodu:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Fiyat:");

        kaliteno_tf.setEditable(false);

        kalitekodu_tf.setEditable(false);

        fiyat_tf.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fiyat_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(kalitekodu_tf)
                    .addComponent(kaliteno_tf))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(kaliteno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(kalitekodu_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fiyat_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        listele_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listele_btn.setText("Geçmişi Listele");
        listele_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listele_btnActionPerformed(evt);
            }
        });

        listele_jlist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listele_jlist);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listele_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listele_btn)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection getConnection() {
        return new ConnectionDB().getConnection();
    }

    private void ekle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_btnActionPerformed
        Connection con = getConnection();//önce bağlantıları hallettik

        MahsulObject m = new MahsulObject();
        MahsulListesi = new ArrayList();//array listi creat ettik sıra içini doldurmakta

        //LinkedList m1=new ArrayList();  LinkedList:arraylist in indexli hali 
        String urun_kodu = urunkodu_tf.getText();
        String urun_adi = urunadi_tf.getText();
        String protein = protein_tf.getText();
        String hektolitre = hektolitre_tf.getText();
        String filizlenmis_tane = filizlenmistane_tf.getText();//textlere girilen değerleri değişkenlere atadık

        String fiyat_ = "", kalite_kodu = "";

        //m1.add(urun_kodu);
        String sql = "Insert Into Mahsul_Bilgileri (urun_kodu,urun_adi, protein, hektolitre, filizlenmis_tane,kalite_kodu, fiyat) "
                + "Values(?,?,?,?,?,?,?)";

        try {
            //indexleri manuel girmek yerine hata yaşanmaması için bir array oluşturduk ve onu döngüye aldık
            PreparedStatement pst = con.prepareStatement(sql);//db ye veri gönderdiğimiz için PreparedStatement kullandık

            int protein1 = Integer.parseInt(protein);
            int hektolitre1 = Integer.parseInt(hektolitre);
            int filizlenmis_tane1 = Integer.parseInt(filizlenmis_tane);
            int kaliteno;
            int sayac = 0;

            if (protein1 >= 5 && protein1 <= 33) {
                sayac += 5;
            } else if (hektolitre1 >= 8 && hektolitre1 <= 56) {
                sayac += 5;
            } else if (filizlenmis_tane1 >= 32 && filizlenmis_tane1 <= 100) {
                sayac += 5;
            }

            if (sayac >= 15) {

                kaliteno = 1;
                kalite_kodu = "4003";
                fiyat_ = "95";
                kaliteno_tf.setText(String.valueOf(kaliteno));
                kalitekodu_tf.setText(String.valueOf(kalite_kodu));
                fiyat_tf.setText(String.valueOf(fiyat_));
            } else {

                kaliteno = 2;
                kalite_kodu = "3003";
                fiyat_ = "75";
                kaliteno_tf.setText(String.valueOf(kaliteno));
                kalitekodu_tf.setText(String.valueOf(kalite_kodu));
                fiyat_tf.setText(String.valueOf(fiyat_));
            }

            String ml[] = generatePSTvalues(urunkodu_tf,
                    urunadi_tf,
                    protein_tf,
                    hektolitre_tf,
                    filizlenmistane_tf,
                    kalitekodu_tf,
                    fiyat_);

            for (int i = 0; i < ml.length; i++) {
                pst.setString(i + 1, ml[i]);
            }

            int sonuc = pst.executeUpdate();//verileri db ye ekledik 

            if (sonuc >= 1) {
                JOptionPane.showMessageDialog(null, "Başarılı İşlem!");
            }
            pst.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Ekle butonu başarısız...HATA:" + e);
        }


    }//GEN-LAST:event_ekle_btnActionPerformed

    String[] generatePSTvalues(JTextField urunFiled,
            JTextField urunadified, JTextField t3, JTextField t4, JTextField t5, JTextField t6, String fiyat) {
        String ml[] = new String[7];
        ml[0] = urunFiled.getText();
        ml[1] = urunadified.getText();
        ml[2] = t3.getText();
        ml[3] = t4.getText();
        ml[4] = t5.getText();
        ml[5] = t6.getText();
        ml[6] = fiyat;
        return ml;
    }

    private void urunkodu_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_urunkodu_tfKeyPressed
        kontrol(evt, urunkodu_tf, '0', '9');
    }//GEN-LAST:event_urunkodu_tfKeyPressed

    private void protein_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_protein_tfKeyPressed
        kontrol(evt, protein_tf, '0', '9');
    }//GEN-LAST:event_protein_tfKeyPressed

    private void hektolitre_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hektolitre_tfKeyPressed
        kontrol(evt, hektolitre_tf, '0', '9');
    }//GEN-LAST:event_hektolitre_tfKeyPressed

    private void filizlenmistane_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filizlenmistane_tfKeyPressed
        kontrol(evt, filizlenmistane_tf, '0', '9');
    }//GEN-LAST:event_filizlenmistane_tfKeyPressed

    void kontrol(KeyEvent event, JTextField textField, char c1, char c2) {

        if (event.getKeyChar() >= c1 && event.getKeyChar() <= c2) {
            textField.setEditable(true);
        } else {
            if (event.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || event.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                textField.setEditable(true);
            } else {
                textField.setEditable(false);
            }
        }
    }

    private void urunadi_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_urunadi_tfKeyPressed

        if (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z') {
            urunadi_tf.setEditable(true);
        } else if (evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') {
            urunadi_tf.setEditable(true);
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                urunadi_tf.setEditable(true);
            } else {
                urunadi_tf.setEditable(false);
            }
        }
    }//GEN-LAST:event_urunadi_tfKeyPressed

    private void listele_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listele_btnActionPerformed
        System.out.println("Listele butonu çalıştı");
        /*ConnectionDB db = new ConnectionDB();
        db.getConnection();*/
        Connection con = getConnection();
        Listele();

    }//GEN-LAST:event_listele_btnActionPerformed
    void Listele() {
        Connection con = getConnection();

        String sql = "Select * from Mahsul_Bilgileri";
        try {
            Statement stm = con.createStatement();
            stm.execute(sql);
            ResultSet rs = stm.getResultSet();
            MahsulListesi = new ArrayList();
            MahsulListesi = generateListFromDb(rs);

            rs.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Listeleme Başarısız... HATA:" + e);
        }
        String[] str = new String[MahsulListesi.size()];

        for (int i = 0; i < MahsulListesi.size(); i++) {
            MahsulObject m = MahsulListesi.get(i);

            str[i] = m.toString();
        }
        listele_jlist.setListData(str);
    }

    private ArrayList<MahsulObject> generateListFromDb(ResultSet rs) throws SQLException {
        ArrayList<MahsulObject> resultList = new ArrayList<>();

        while (rs.next()) {
            MahsulObject m = new MahsulObject();

            m.setId(rs.getInt("ID"));
            m.setUrun_adi(rs.getString("urun_adi"));
            m.setUrun_kodu(rs.getInt("urun_kodu"));
            m.setProtein(rs.getFloat("protein"));
            m.setHektolitre(rs.getFloat("hektolitre"));
            m.setFilizlenmis_tane(rs.getFloat("filizlenmis_tane"));
            m.setKalite_kodu(rs.getInt("kalite_kodu"));
            m.setFiyat(rs.getInt("fiyat"));

            resultList.add(m);
        }
        return resultList;

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mahsul_jframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ekle_btn;
    private javax.swing.JTextField filizlenmistane_tf;
    private javax.swing.JTextField fiyat_tf;
    private javax.swing.JTextField hektolitre_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kalitekodu_tf;
    private javax.swing.JTextField kaliteno_tf;
    private javax.swing.JButton listele_btn;
    private javax.swing.JList<String> listele_jlist;
    private javax.swing.JTextField protein_tf;
    private javax.swing.JTextField urunadi_tf;
    private javax.swing.JTextField urunkodu_tf;
    // End of variables declaration//GEN-END:variables
}
