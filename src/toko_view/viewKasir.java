/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_view;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import toko_controller.controllerKasir;

/**
 *
 * @author Prasetya
 */
public class viewKasir extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewKasir
     */
    private controllerKasir cK;
    private DefaultTableModel model;
    public viewKasir() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        cK = new controllerKasir(this);
        
        model = new DefaultTableModel();
        tabelKasir.setModel(model);
        model.addColumn("Nama Barang");
        model.addColumn("Harga Barang");
        model.addColumn("Qty Barang");
        model.addColumn("Sub Total");
        
        jmlBeli.setValue(1);
        cK.controlButtonBayar();
    }

    public JTextField getHargaBarang() {
        return hargaBarang;
    }

    public JTextField getNamaBarang() {
        return namaBarang;
    }

    public JSpinner getJmlBeli() {
        return jmlBeli;
    }

    public JTextField getBayar() {
        return bayar;
    }

    public JTextField getKembali() {
        return kembali;
    }

    public JLabel getLabelTotalHarga() {
        return labelTotalHarga;
    }

    public JTextField getNamaPembeli() {
        return namaPembeli;
    }

    public JTextField getTotal() {
        return total;
    }

    public JTextField getJumlahBarang() {
        return jumlahBarang;
    }

    public JButton getTombolBatalTransaksi() {
        return tombolBatalTransaksi;
    }

    public JButton getTombolBayar() {
        return tombolBayar;
    }

    public JButton getTombolSelesai() {
        return tombolSelesai;
    }

    public JButton getTombolCariBarang() {
        return tombolCariBarang;
    }

    public JButton getTombolTambahBarang() {
        return tombolTambahBarang;
    }

    public JTable getTabelKasir() {
        return tabelKasir;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namaBarang = new javax.swing.JTextField();
        tombolCariBarang = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        hargaBarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jmlBeli = new javax.swing.JSpinner();
        tombolTambahBarang = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKasir = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        labelTotalHarga = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namaPembeli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        kembali = new javax.swing.JTextField();
        tombolBatalTransaksi = new javax.swing.JButton();
        tombolSelesai = new javax.swing.JButton();
        tombolBayar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jumlahBarang = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 102));
        setBorder(null);
        setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PILIH BARANG");

        jLabel2.setText("NAMA");

        namaBarang.setEnabled(false);

        tombolCariBarang.setText("Cari Barang");
        tombolCariBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCariBarangActionPerformed(evt);
            }
        });

        jLabel3.setText("HARGA");

        hargaBarang.setEnabled(false);

        jLabel4.setText("JUMLAH");

        tombolTambahBarang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tombolTambahBarang.setText("TAMBAH");
        tombolTambahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaBarang)
                            .addComponent(hargaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addComponent(tombolCariBarang))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jmlBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(tombolTambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolCariBarang))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jmlBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolTambahBarang)
                        .addContainerGap())))
        );

        tabelKasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelKasir);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 2, 24)); // NOI18N
        jLabel5.setText("TOTAL");

        labelTotalHarga.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        labelTotalHarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTotalHarga.setText("0");
        labelTotalHarga.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 319, Short.MAX_VALUE))
                    .addComponent(labelTotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel7.setText("PEMBAYARAN");

        jLabel8.setText("Nama Pembeli");

        jLabel9.setText("Total");

        total.setText("0");
        total.setEnabled(false);

        jLabel10.setText("Bayar");

        jLabel11.setText("Kembali");

        bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bayarKeyTyped(evt);
            }
        });

        kembali.setEnabled(false);

        tombolBatalTransaksi.setText("Batal");
        tombolBatalTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBatalTransaksiActionPerformed(evt);
            }
        });

        tombolSelesai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tombolSelesai.setText("SELESAI");
        tombolSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSelesaiActionPerformed(evt);
            }
        });

        tombolBayar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tombolBayar.setText("BAYAR");
        tombolBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBayarActionPerformed(evt);
            }
        });

        jLabel12.setText("Jumlah Beli");

        jumlahBarang.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(tombolBatalTransaksi)
                    .addComponent(jLabel12))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaPembeli)
                            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                        .addGap(144, 144, 144)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bayar)
                                    .addComponent(kembali, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tombolBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tombolSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(namaPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tombolBatalTransaksi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tombolSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tombolBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolCariBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCariBarangActionPerformed
        // TODO add your handling code here:
        viewCariBarang v = new viewCariBarang(this);
        v.setVisible(true);
    }//GEN-LAST:event_tombolCariBarangActionPerformed

    private void tombolTambahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahBarangActionPerformed
        // TODO add your handling code here:
        if(namaBarang.getText().equals("")||hargaBarang.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Data barang belum diisi");
        }else if(Integer.parseInt(jmlBeli.getValue().toString())<=0){
            JOptionPane.showMessageDialog(null, "Jumlah Barang tidak benar");
        }else{
            Object[] hasil;
            hasil = new Object[4];
            hasil[0] = namaBarang.getText();
            hasil[1] = hargaBarang.getText();
            hasil[2] = jmlBeli.getValue().toString();
            hasil[3] = Integer.parseInt(jmlBeli.getValue().toString()) * Integer.parseInt(hargaBarang.getText());

            model.addRow(hasil);

            Integer totalHarga = 0;
            Integer jumlahQty = 0;
            if(Integer.parseInt(total.getText())==0){
                int subtotal = Integer.parseInt(tabelKasir.getValueAt(0, 3).toString());
                int qty = Integer.parseInt(tabelKasir.getValueAt(0, 2).toString());
                totalHarga = subtotal;
                jumlahQty = qty;
            }else{
                for(int i = 0;i<model.getRowCount();i++){
                    int subtotal = Integer.parseInt(tabelKasir.getValueAt(i, 3).toString());
                    totalHarga = totalHarga + subtotal;
                    int qty = Integer.parseInt(tabelKasir.getValueAt(i, 2).toString());
                    jumlahQty = jumlahQty + qty;
                }
            }
            total.setText(String.valueOf(totalHarga));
            labelTotalHarga.setText(String.valueOf(totalHarga));
            jumlahBarang.setText(String.valueOf(jumlahQty));
        }
    }//GEN-LAST:event_tombolTambahBarangActionPerformed

    private void tombolSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSelesaiActionPerformed
        // TODO add your handling code here:
        cK.simpanTransaksi();
        cK.resetForm();
        cK.controlButtonBayar();
    }//GEN-LAST:event_tombolSelesaiActionPerformed

    private void tombolBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBayarActionPerformed
        // TODO add your handling code here:
        if(namaPembeli.getText().equals("")||bayar.getText().equals("")||jumlahBarang.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
        }else{
            cK.bayar();
            cK.controlButtonSelesai();
        }
        
    }//GEN-LAST:event_tombolBayarActionPerformed

    private void tombolBatalTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBatalTransaksiActionPerformed
        // TODO add your handling code here:
        cK.resetForm();
    }//GEN-LAST:event_tombolBatalTransaksiActionPerformed

    private void bayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bayarKeyTyped
        // TODO add your handling code here:
        char i = evt.getKeyChar();
        if(!((Character.isDigit(i))||(i==KeyEvent.VK_BACK_SPACE))||(i==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            //JOptionPane.showMessageDialog(null, "Hanya Masukan Angka!");
            evt.consume();
        }
    }//GEN-LAST:event_bayarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bayar;
    private javax.swing.JTextField hargaBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jmlBeli;
    private javax.swing.JTextField jumlahBarang;
    private javax.swing.JTextField kembali;
    private javax.swing.JLabel labelTotalHarga;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTextField namaPembeli;
    private javax.swing.JTable tabelKasir;
    private javax.swing.JButton tombolBatalTransaksi;
    private javax.swing.JButton tombolBayar;
    private javax.swing.JButton tombolCariBarang;
    private javax.swing.JButton tombolSelesai;
    private javax.swing.JButton tombolTambahBarang;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
