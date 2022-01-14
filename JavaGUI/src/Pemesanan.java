/**
 *
 * @author Fitri Fauziyah
 */
public class Pemesanan extends javax.swing.JFrame {
    private int hargaSteak = 60000, hargaSpaghetti = 45000, hargaPizza = 130000;

    public Pemesanan() {
        initComponents();
    }
    
    private String pemesanan = "";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_judulApp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        tf_alamat = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        tf_noTelp = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cb_steak = new javax.swing.JCheckBox();
        cb_spaghetti = new javax.swing.JCheckBox();
        cb_pizza = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        tf_totalBayar = new javax.swing.JTextField();
        b_tambah = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_dataPenjualan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_judulApp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_judulApp.setText("APLIKASI PEMESANAN");
        getContentPane().add(l_judulApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Customer"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nama:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setText("Alamat:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setText("No Telp:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        tf_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_namaActionPerformed(evt);
            }
        });
        jPanel1.add(tf_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 130, -1));

        tf_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_alamatActionPerformed(evt);
            }
        });
        jPanel1.add(tf_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 130, -1));

        jTextField3.setText("jTextField3");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 193, -1, -1));

        tf_noTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_noTelpActionPerformed(evt);
            }
        });
        jPanel1.add(tf_noTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 330, 180));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pilih Menu"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_steak.setText("Steak");
        cb_steak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_steakActionPerformed(evt);
            }
        });
        jPanel2.add(cb_steak, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        cb_spaghetti.setText("Spaghetti");
        cb_spaghetti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_spaghettiActionPerformed(evt);
            }
        });
        jPanel2.add(cb_spaghetti, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        cb_pizza.setText("Pizza");
        cb_pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pizzaActionPerformed(evt);
            }
        });
        jPanel2.add(cb_pizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 190, 160));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("TOTAL BAYAR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        tf_totalBayar.setBackground(new java.awt.Color(0, 0, 0));
        tf_totalBayar.setForeground(new java.awt.Color(255, 255, 0));
        tf_totalBayar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(tf_totalBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 220, -1));

        b_tambah.setText("TAMBAH");
        b_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tambahActionPerformed(evt);
            }
        });
        getContentPane().add(b_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Penjualan"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta_dataPenjualan.setColumns(20);
        ta_dataPenjualan.setRows(5);
        jScrollPane1.setViewportView(ta_dataPenjualan);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 18, 530, 150));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 550, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_steakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_steakActionPerformed
        getTotal();
    }//GEN-LAST:event_cb_steakActionPerformed

    private void tf_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_namaActionPerformed
        tf_nama.getText();
    }//GEN-LAST:event_tf_namaActionPerformed

    private void cb_spaghettiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_spaghettiActionPerformed
        getTotal();
    }//GEN-LAST:event_cb_spaghettiActionPerformed

    private void cb_pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pizzaActionPerformed
        getTotal();
    }//GEN-LAST:event_cb_pizzaActionPerformed

    private void tf_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_alamatActionPerformed
        tf_alamat.getText();
    }//GEN-LAST:event_tf_alamatActionPerformed

    private void tf_noTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_noTelpActionPerformed
        tf_noTelp.getText();
    }//GEN-LAST:event_tf_noTelpActionPerformed

    private void b_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tambahActionPerformed
        pemesanan += "Nama : " + tf_nama.getText() + "\n";
        pemesanan += "Alamat : " + tf_alamat.getText() + "\n";
        pemesanan += "Telp : " + tf_noTelp.getText() + "\n";
        pemesanan += "----------------------------------------\n";
        pemesanan += "Pesanan:\n";
        if (cb_steak.isSelected())
            pemesanan += "  - " + cb_steak.getText() + " (Rp" + String.valueOf(hargaSteak) + ")\n";
        if (cb_spaghetti.isSelected())
            pemesanan += "  - " + cb_spaghetti.getText() + " (Rp" + String.valueOf(hargaSpaghetti) + ")\n";
        if (cb_pizza.isSelected())
            pemesanan += "  - " + cb_pizza.getText() + " (Rp" + String.valueOf(hargaPizza) + ")\n";
        pemesanan += "----------------------------------------\n";
        pemesanan += "Total Bayar:\n    Rp" + tf_totalBayar.getText() + "\n";
        ta_dataPenjualan.setText(pemesanan);
    }//GEN-LAST:event_b_tambahActionPerformed

    private void getTotal() {
        int total = 0;
        
        if (cb_steak.isSelected())
            total += hargaSteak;
        if (cb_spaghetti.isSelected())
            total += hargaSpaghetti;
        if (cb_pizza.isSelected())
            total += hargaPizza;
        
        tf_totalBayar.setText(String.valueOf(total));
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_tambah;
    private javax.swing.JCheckBox cb_pizza;
    private javax.swing.JCheckBox cb_spaghetti;
    private javax.swing.JCheckBox cb_steak;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel l_judulApp;
    private javax.swing.JTextArea ta_dataPenjualan;
    private javax.swing.JTextField tf_alamat;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_noTelp;
    private javax.swing.JTextField tf_totalBayar;
    // End of variables declaration//GEN-END:variables
}
